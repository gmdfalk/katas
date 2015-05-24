package codechef.easy;

public class TheLeadGame {

	public static int[] main(int[] is) {
		int player1Score = 0, player2Score = 0;
		int maxLead = -1;
		int leader = -1;
		int lead = -1;
		for (int i = 0; i < is.length-1; i++) {
			player1Score += is[i];
			player2Score += is[i + 1];
			lead = Math.abs(player1Score - player2Score);
			if (lead > maxLead) {
				if (player1Score > player2Score) {
					leader = 1;
				} else {
					leader = 2;
				}
				maxLead = lead;
			}
		}
		return new int[] {leader, maxLead};
	}

}
