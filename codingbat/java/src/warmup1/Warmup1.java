package warmup1;

// CodingBat Warump1 "Challenge"
public final class Warmup1 {

	private Warmup1() {
	};

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
		return front + front + front;
	}

	public static String backAround(String str) {
		char lastChar = str.charAt(str.length() - 1);
		return lastChar + str + lastChar;
		// String last = str.substring(str.length() - 1);
		// return last + str + last;
	}

	public static boolean or35(int i) {
		return (i % 3 == 0) || (i % 5 == 0);
	}

	public static String front22(String str) {
		String part;
		if (str.length() < 2)
			part = str;
		else
			part = str.substring(0, 2);
		return part + str + part;
	}

	public static boolean startHi(String string) {
		return string.startsWith("hi");
	}

	public static boolean icyHot(int i, int j) {
		return (i < 0 && j > 0 || j < 0 && i > 0);
	}

	public static boolean in1020(int i, int j) {
		return (i >= 10 && i <= 20) || (j >= 10 && j <= 20);
	}

	private static boolean isTeen(int n) {
		return (n >= 13 && n <= 19);
	}

	public static boolean hasTeen(int i, int j, int k) {
		return isTeen(i) || isTeen(j) || isTeen(k);
	}

	public static boolean loneTeen(int i, int j) {
		return isTeen(i) ^ isTeen(j);
	}

	public static String delDel(String string) {
		return string.substring(1, 4).equals("del") ? string.substring(0, 1)
				+ string.substring(4, string.length()) : string;
	}

	public static Boolean mixStart(String string) {
		return string.matches(".ix .*");
	}

	public static String startOz(String string) {
		String result = "";

		if (string.length() >= 1 && string.charAt(0) == 'o') {
			result = result + string.charAt(0);
		}

		if (string.length() >= 2 && string.charAt(1) == 'z') {
			result = result + string.charAt(1);
		}

		return result;
	}

	public static int intMax(int i, int j, int k) {
		return Math.max(Math.max(i, j), k);
	}

	public static int close10(int a, int b) {
		int aDiff, bDiff;
		aDiff = Math.abs(10 - a);
		bDiff = Math.abs(10 - b);
		if (aDiff < bDiff)
			return a;
		else if (bDiff < aDiff)
			return b;
		return 0;
	}
	
	public static boolean in3050(int i, int j) {
		return (i >= 30 && i <= 40) && (j >= 30 && j <= 40)
				|| (i >= 40 && i <= 50) && (j >= 40 && j <= 50);
	}

	public static int max1020(int i, int j) {
		int max = Math.max(i, j);
		return max >= 10 && max <= 20 ? max : 0;
	}

	public static boolean stringE(String string) {
		int count = string.length() - string.replace("e",  "").length();
		return count > 0 && count < 4;
	}

	public static boolean lastDigit(int i, int j) {
		return j%10 == i%10;
	}
}
