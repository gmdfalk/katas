package warmup1;

public class Warmup1 {

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
}
