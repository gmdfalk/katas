package string1;

public final class String1 {

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

	public static String middleTwo(String str) {
		int middle = str.length()/2;
		return str.substring(middle-1, middle+1);
	}

	public static Boolean endsLy(String string) {
		if (string.length() < 2)
			return false;
		return string.substring(string.length()-2).equals( "ly");
	}

	public static String nTwice(String string, int i) {
		return string.substring(0, i) + string.substring(string.length()-i);
	}

	public static String twoChar(String string, int i) {
		if (i+2 > string.length())
			return string.substring(0, 2);
		return string.substring(i, i+2);
	}

	public static String middleThree(String string) {
		int mid = string.length()/2;
		return string.substring(mid-1, mid+2);
	}

	public static Boolean hasBad(String string) {
		final int idx = string.indexOf("bad");
		return idx == 1 || idx == 0;
	}

	public static String atFirst(String string) {
		if (string.length() < 2) {
			return string + "@";
		} 
		return string.substring(0, 2);
			
	}

	public static String lastChars(String s1, String s2) {
		String result = "";
		result += s1.length() < 1 ? "@" : s1.charAt(0);
		result += s2.length() < 1 ? "@" : s2.charAt(s2.length()-1);
		return result;
	}

	public static String conCat(String s1, String s2) {
		if (s1.length() < 1)
			return s2;
		if (s2.length() < 1)
			return s1;
		return s1.charAt(s1.length()-1) == s2.charAt(0) ? s1 + s2.substring(1) : s1 + s2;
	}

	public static String lastTwo(String string) {
		final int len = string.length();
		if (len < 2)
			return string;
		return string.substring(0, len-2) + string.charAt(len-1) + string.charAt(len-2);
	}

	public static String seeColor(String string) {
		if (string.startsWith("red"))
			return "red";
		else if (string.startsWith("blue"))
			return "blue";
		else
			return "";
	}

	public static Boolean frontAgain(String string) {
		int len = string.length();
		return string.substring(0, 2).equals(string.substring(len-2, len));
	}

	public static String minCat(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return s1.substring(s1.length()-s2.length()) + s2;
		} else if (s2.length() > s1.length()) {
			return s1 + s2.substring(s2.length()-s1.length());
		} else {
			return s1+s2;
		}
	}

	public static String extraFront(String s) {
		if (s.length() < 2)
			return s + s + s;
		return s.substring(0, 2) + s.substring(0, 2) + s.substring(0, 2);
	}
}
