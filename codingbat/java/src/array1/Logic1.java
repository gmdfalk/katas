package array1;

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

}
