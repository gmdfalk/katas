package codechef.easy;

public class HolesInTheText {

	public static int main(String string) {
		char[] oneHoledLetters = new char[] { 'A', 'D', 'O', 'P', 'Q', 'R' };
		char twoHoled = 'B';
		int holes = 0;
		for (char c : string.toCharArray()) {
			if (c == twoHoled) {
				holes += 2;
				continue;
			}
			for (char ch : oneHoledLetters) {
				if (c == ch) {
					holes++;
				}
			}
		}
		return holes;
	}

}
