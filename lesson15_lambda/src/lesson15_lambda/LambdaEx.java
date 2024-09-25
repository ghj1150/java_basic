package lesson15_lambda;
 
import java.util.function.Function;

public class LambdaEx {
	public static void main(String[] args) {
		MyInter<Integer> inter = t -> t * t;
		System.out.println(inter.m(10));

		MyInter<String> inter2 = s -> "hello !! " + s;
		System.out.println(inter2.m("새똥이"));

		Function<String, Integer> f = s -> Integer.parseInt(s);

		int result = f.apply("1234");
		System.out.println(result + 1000);

		Object o = new MyInter<Integer>() {

			@Override
			public Integer m(Integer t) {
				return t;
			}

		};
		
		Object o2 = (MyInter<String>)(s -> s);
	}
}

@FunctionalInterface
interface MyInter<T> {
	T m(T t);

	default T m2(T t) {
		return t;
	}
}
