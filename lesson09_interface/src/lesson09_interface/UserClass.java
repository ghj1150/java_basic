package lesson09_interface;

@UserAnno(value = "hey")
public class UserClass {
	@UserAnno({"hi"})
	void m() {
		
	}
	
	@UserAnno(value = "wolrd", number = 10)
	@SuppressWarnings(value = "unused")
	void m2() {
		
	}
	
	@UserAnno(value = {"hey", "hi", "world"}, number = 5)
	int i;
}
