package codingbat.logic;

public class Logic1 {

	public static Boolean cigarParty(int i, boolean b) {
		return (i >= 40 && i <= 60 && !b) || (i >= 40 && b);
	}

	public static Integer dateFashion(int i, int j) {
		if (i <= 2 || j <= 2)
			return 0;
		else if (i >= 8 || j >= 8)
			return 2;
		return 1;
	}

	public static Boolean squirrelPlay(int temp, boolean isSummer) {
		int max = isSummer ? 100 : 90;
		return temp >= 60 && temp <= max;
	}

	public static Integer caughtSpeeding(int speed, boolean isBirthday) {
		int max = isBirthday ? 5 : 0;
		if (speed > 80 + max)
			return 2;
		else if (speed > 60 + max)
			return 1;
		return 0;
	}

	public static Integer sortaSum(int i, int j) {
		final int sum = i + j;
		return sum >= 10 && sum <= 19 ? 20 : sum;
	}

	public static String alarmClock(int day, boolean vacation) {
		String result = "";
		boolean isWeekday = day >= 1 && day <= 5;
		if (isWeekday) {
			result = vacation ? "10:00" : "7:00";
		} else {
			result = vacation ? "off" : "10:00";
		}
		return result;
	}

	public static Boolean love6(int i, int j) {
		return Math.abs(i + j) == 6 || i == 6 || j == 6;
	}

	public static Boolean in1To10(int i, boolean b) {
		if (b)
			return i <= 1 || i >= 10;
		return i >= 1 && i <= 10;
	}

	public static Boolean specialEleven(int i) {
		return i % 11 < 2;
	}

	public static Boolean more20(int i) {
		return i % 20 > 0;
	}

	public static Boolean old35(int i) {
		return !(i % 3 == 0 && i % 5 == 0) && (i % 3 == 0 || i % 5 == 0);
	}

	public static Boolean less20(int i) {
		return i % 20 > 17;
	}

	public static Boolean nearTen(int i) {
		return i % 10 > 7 || i % 10 < 3;
	}

	public static Integer teenSum(int i, int j) {
		return (i >= 13 && i <= 19) || (j >= 13 && j <= 19) ? 19 : i + j;
	}

	public static Boolean answerCell(boolean isMorning, boolean isMom,
			boolean isAsleep) {
		if (isAsleep || (isMorning && !isMom))
			return false;
		return true;
	}

	public static Integer teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5)
			return 0;
		else if (tea > candy * 2 || candy > tea * 2)
			return 2;
		return 1;
	}

	public static String fizzString(String string) {
		if (string.matches("f.*b"))
			return "FizzBuzz";
		else if (string.startsWith("f"))
			return "Fizz";
		else if (string.endsWith("b"))
			return "Buzz";
		return "";
	}

	public static String fizzString2(int i) {
		if (i % 3 == 0)
			return "Fizz!";
		return String.valueOf(i) + "!";
	}

	public static Boolean twoAsOne(int i, int j, int k) {
		return i + j == k || j + k == i || i + k == j;
	}

	public static Boolean inOrder(int a, int b, int c, boolean bOk) {
		if (bOk)
			return c > b;
		return b > a && c > b;
	}

	public static boolean inOrderEqual(int i, int j, int k, boolean b) {
		if (b) {
			return j >= i && k >= j;
		}
		return inOrder(i, j, k, false);
	}

	public static boolean lastDigit(int i, int j, int k) {
		return i % 10 == j % 10 || j % 10 == k % 10 || i % 10 == k % 10;
	}

	public static boolean lessBy10(int a, int b, int c) {
		return isLb10(a, b) || isLb10(a, c) || isLb10(b, c);
	}

	private static boolean isLb10(int a, int b) {
		return a + 9 < b || b + 9 < a;
	}

	public static int withoutDoubles(int i, int j, boolean b) {
		if (b && i == j && ++i == 7) {
			i = 1;
		}
		return i + j;
	}

	public static int maxMod5(int i, int j) {
		if (i == j)
			return 0;
		if (i % 5 == j % 5)
			return Math.min(i, j);
		return Math.max(i, j);
	}

	public static int redTicket(int i, int j, int k) {
		if (i == k && i == j) {
			return i == 2 ? 10 : 5;
		}
		if (k != i && j != i) {
			return 1;
		}
		return 0;
	}

	public static int greenTicket(int i, int j, int k) {
		if (i == j && i == k)
			return 20;
		if (i == j || j == k)
			return 10;
		return 0;
	}

	public static int blueTicket(int a, int b, int c) {
		final int ab = a + b, ac = a + c, bc = b + c;
		if (ab == 10 || ac == 10 || bc == 10) {
			return 10;
		} else if (ab == bc + 10 || ab == ac + 10) {
			return 5;
		}
		return 0;
	}

	public static boolean shareDigit(int i, int j) {
		return i % 10 == j % 10 || i / 10 == j / 10 || i / 10 == j % 10
				|| j / 10 == i % 10;
	}

	public static int sumLimit(int i, int j) {
		return String.valueOf(i).length() == String.valueOf(i + j).length() ? i
				+ j : i;
	}

}
