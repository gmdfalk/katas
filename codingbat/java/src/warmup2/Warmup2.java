package warmup2;

import java.util.ArrayList;

public final class Warmup2 {

	private Warmup2() {
		// Do not instantiate since this is a utility class.
	}

	public static String stringTimes(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++)
			result += str;
		return result;
	}

	public static String frontTimes(String str, int n) {
		if (str.length() < 3)
			return str;
		String result = "";
		for (int i = 0; i < n; i++)
			result += str.substring(0, 3);
		return result;
	}

	public static int countXx(String string) {
		int count = 0;
		for (int i = 0; i < string.length() - 1; i++) {
			if (string.substring(i, i + 2).equals("xx"))
				count++;
		}

		return count;
	}

	public static boolean doubleX(String string) {
		int idx = string.indexOf("x");
		return ("" + string.charAt(idx) + string.charAt(idx + 1)).equals("xx");
	}

	public static String stringBits(String string) {
		String result = "";

		for (int i = 0; i < string.length(); i += 2)
			result += string.charAt(i);

		return result;
	}

	public static String stringSplosion(String string) {
		String result = "";

		for (int i = 0; i < string.length(); i++)
			result += string.substring(0, i + 1);

		return result;
	}

	public static int last2(String string) {
		String target = string.substring(string.length() - 2, string.length());
		int count = 0;

		for (int i = 0; i < string.length() - 2; i++) {
			if (string.substring(i, i + 2).equals(target))
				count++;
		}

		return count;
	}

	public static int arrayCount9(int[] array) {
		int count = 0;

		for (int i : array)
			if (i == 9)
				count++;

		return count;
	}

	public static boolean arrayFront9(int[] is) {
		for (int i = 0; i < is.length && i < 4; i++)
			if (is[i] == 9)
				return true;
		return false;
	}

	public static boolean array123(int[] is) {
		for (int i = 0; i < is.length - 2; i++) {
			if (is[0] == 1 && is[i + 1] == 2 && is[i + 2] == 3)
				return true;
		}
		return false;
	}

	public static int stringMatch(String s1, String s2) {
		int count = 0;
		for (int i = 0; i < s1.length() - 1; i++) {
			for (int j = 0; j < s2.length() - 1; j++) {
				if (s1.substring(i, i + 2).equals(s2.substring(j, j + 2))) {
					count++;
				}
			}
		}
		return count;
	}

	public static String stringX(String str) {
//		String result = "";
//		boolean end = false, start = false;
//		
//		if (str.charAt(0) == 'x')
//			start = true;
//		if (str.charAt(str.length()-1) == 'x')
//			end = true;
//		
//		result = str.replaceAll("x", "");
//		
//		if (end)
//			result += "x";
//		if (start)
//			result = "x" + result;
//		
//		return result;
		
		//Shorter (better?):
		String substr, result = "";
		for (int i=0; i < str.length(); i++) {
			substr = str.substring(i, i+1);
			if (!(i > 0 && i < (str.length()-1) && substr.equals("x")))
				result += substr;
		}
		return result;
	}

	public static String altPairs(String str) {
		String result = "";
		for (int i=0; i < str.length(); i +=4)
			if (i+1 == str.length())
				result += str.charAt(i);
			else
				result += str.substring(i, i+2);
			
		return result;
	}

	public static String stringYak(String str) {
		String result = "";
		
		int yakIdx = str.indexOf("yak");
		
		result += str.substring(0, yakIdx) + str.substring(yakIdx+3, str.length());
		
		return result;
	}
}
