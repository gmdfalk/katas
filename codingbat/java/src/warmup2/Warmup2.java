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
		for (int i=0; i < n; i++)
			result += str.substring(0, 3);
		return result;
	}

	public static int countXx(String string) {
		int count = 0;
		for (int i=0; i < string.length() -1; i++) {
				if (string.substring(i, i+2).equals("xx"))
					count++;
		}
		
		return count;
	}

	public static boolean doubleX(String string) {
		int idx = string.indexOf("x");
		return ("" + string.charAt(idx) + string.charAt(idx+1)).equals("xx");
	}

	public static String stringBits(String string) {
		String result = "";
		
		for (int i=0; i < string.length(); i += 2)
			result += string.charAt(i);
		
		return result;
	}

	public static String stringSplosion(String string) {
		String result = "";
		
		for (int i=0; i < string.length(); i++)
			result += string.substring(0, i+1);
		
		return result;
	}

	public static int last2(String string) {
		String target = string.substring(string.length()-2, string.length());
		int count = 0;

		for (int i=0; i < string.length()-2; i++) {
			if (string.substring(i, i+2).equals(target))
				count++;
		}
		
		return count;
	}

	public static int arrayCount9(int[] array) {
		int count = 0;
		
		for (int i : array)
			if (i == 9)
				count ++;
		
		return count;
	}

	public static boolean arrayFront9(int[] is) {
		for (int i=0; i < is.length && i < 4; i++)
			if (is[i] == 9)
				return true;
		return false;
	}
	
	
}
