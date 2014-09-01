package string1;

public class String1 {

	private String1() {
	}

	public static String helloName(String str) {

		return String.format("Hello %s", str);
	}

	public static String makeAbba(String s1, String s2) {
		return String.format("%s%s%s%s", s1, s2, s2, s1);
	}

	public static String makeTags(String s1, String s2) {
		return String.format("<%s>%s</%s>", s1, s2, s1);
	}

	public static String makeOutWord(String s1, String s2) {
		return String.format("%s%s%s", s1.substring(0, 2), s2, s1.substring(2));
	}
}
