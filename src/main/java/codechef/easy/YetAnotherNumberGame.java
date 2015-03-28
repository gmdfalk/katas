package codechef.easy;

public class YetAnotherNumberGame {

	public static String main(int n) {
		Player player = new Player("ALICE");

		while (n > 0) {
			n -= findHighestDivisor(n);
			player.swap();
		}

		return player.getName();
	}

	private static int findHighestDivisor(int n) {
		int divisor = 1;
		
		for (int i=n-1; i > 0; i--) {
			if (n % i == 0) {
				divisor = i;
				break;
			}
		}
		
		return divisor;
	}

}

class Player {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void swap() {
		if (name.equals("ALICE")) {
			name = "BOB";
		} else {
			name = "ALICE";
		}
	}
}
