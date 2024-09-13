package lesson12_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("b[a-z]*");
		Matcher m;

		m = pattern.matcher("bat");
		System.out.println("bat = " + m.matches());

		m = pattern.matcher("cat");
		System.out.println("cat = " + m.matches());

		m = pattern.matcher("bed");
		System.out.println("bed = " + m.matches());
		
		System.out.println("bat".matches("b[a-z]*"));;
	}
}
