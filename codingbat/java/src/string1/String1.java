package string1;

public class String1 {
	
	private String1() {
	}

	public static String helloName(String str) {

		return "Hello " + str;
	}

	public static String makeAbba(String s1, String s2) {
		return s1 + s2 + s2 + s1;
	}
}
