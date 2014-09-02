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

	public static String extraEnd(String str) {
		String result;
		if (str.length() < 3)
			result = repeat(3, str);
		else if (str.length() == 3)
			result = repeat(3, str.substring(2));
		else
			result = repeat(3, str.substring(3));
		return result;
	}
	
	public static String repeat(int count, String str) {
	    return new String(new char[count]).replace("\0", str);
	}

	public static String firstTwo(String string) {
		return string.substring(0, 2);
	}

	public static String firstHalf(String string) {
		return string.substring(0, string.length()/2);
	}
}