package codechef.easy;

public class LifeTheUniverseAndEverything {

	public static int main(String[] strings) {
		int num = -1, lastNum = -1;
		for (String string : strings) {
			if (isParsable(string)) {
				num = Integer.parseInt(string);
				if (num == 42) {
					return lastNum;
				}
				lastNum = num;
			}
		}
		return lastNum;
	}
	
	private static boolean isParsable(String string) {
		try {
			Integer.parseInt(string);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
