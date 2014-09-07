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

	public static String withoutEnd(String str) {
		return str.substring(1, str.length()-1);
	}

	public static String comboString(String s1, String s2) {
		String longStr = s1.length() > s2.length() ? s1 : s2;
		String shortStr = s1.length() > s2.length() ? s2 : s1;
		return shortStr + longStr + shortStr;
	}

	public static String nonStart(String s1, String s2) {
		return s1.substring(1, s1.length()) + s2.substring(1, s2.length());
	}

	public static String left2(String string) {
		return string.substring(2, string.length()) + string.substring(0,2);
	}

	public static String right2(String str) {
		int len = str.length();
		return str.substring(len-2, len) + str.substring(0, len-2);
	}

	public static String theEnd(String s, boolean b) {
		return b ? s.substring(0, 1) : s.substring(s.length()-1, s.length());
	}

	public static String withouEnd(String str) {
		return str.substring(1, str.length()-1);
	}
}
