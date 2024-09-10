package lesson09_interface;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnno {
	String[] value() default "";
	int number() default 5;
}
