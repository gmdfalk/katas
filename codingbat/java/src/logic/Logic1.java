package logic;

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
		return Math.abs(i+j) == 6 || i == 6  || j == 6;
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
}
