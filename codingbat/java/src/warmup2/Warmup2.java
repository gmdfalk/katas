package warmup2;

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
		for (int i=0; i < string.length(); i++) {
			try {
				if (string.substring(i, i+2).equals("xx"))
					count++;
			} catch (StringIndexOutOfBoundsException e) {
				
			}
		}
		
		return count;
	}
	
}
