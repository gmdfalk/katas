package warmup1;

public class Warmup1 {
	
	private Warmup1() {};

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation)
			return true;
		else
			return false;
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if ((aSmile && bSmile) || (!aSmile && !bSmile))
			return true;
		else
			return false;
	}

	public static int sumDouble(int i, int j) {
		if (i != j)
			return i + j;
		else
			return (i + j) * 2;
	}

	public static int diff21(int i) {
		if (i > 21)
			return 2 * Math.abs(i - 21);
		else
			return Math.abs(i - 21);
	}

	public static boolean parrotTrouble(boolean b, int i) {
		if (b && (i < 7 || i > 20))
			return true;
		else
			return false;
	}

	public static boolean makes10(int i, int j) {
		if (i + j == 10 || i == 10 || j == 10)
			return true;
		else
			return false;
	}

	public static boolean nearHundred(int i) {
		if ((i < 111 && i > 89) || (i < 211 && i > 189))
			return true;
		else
			return false;
		// return ((Math.abs(100 - i) <= 10) ||
		// (Math.abs(200 - i) <= 10));
	}

	public static boolean posNeg(int i, int j, boolean b) {
		if (b)
			return true ? (i < 0 && j < 0) : false;
		else
			return true ? ((i < 0 && j >= 0) || (j < 0 && i >= 0)) : false;
		// if (b) {
		// return (i < 0 && j < 0);
		// } else {
		// return ((i < 0 && j > 0) || (i > 0 && j < 0));
		// }
	}

	public static String notString(String string) {
		return "not " + string;
	}

	public static String missingChar(String str, int n) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == n)
				continue;
			result += str.charAt(i);
		}
		return result;
	}

	public static String frontBack(String str) {
		if (str.length() < 2)
			return str;
		return "" + str.charAt(str.length() - 1)
				+ str.subSequence(1, str.length() - 1) + str.charAt(0);
		// String front = str.substring(0, n);
		// String back = str.substring(n+1, str.length());
	}

	public static String front3(String str) {
		String front;
		if (str.length() < 3)
			front = str;
		else
			front = str.subSequence(0, 3).toString();
		return front+front+front;
	}

	public static String backAround(String str) {
		char lastChar = str.charAt(str.length()-1);
		return  lastChar + str + lastChar;
//		String last = str.substring(str.length() - 1);
//		return last + str + last;
	}

	public static boolean or35(int i) {
		return (i % 3 == 0) || (i % 5 == 0);
	}
}
