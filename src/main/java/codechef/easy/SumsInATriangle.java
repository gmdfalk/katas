package codechef.easy;

public class SumsInATriangle {

	public static int main(int[][] data) {

		for (int r = data.length - 1; r > 0; r--)
			for (int c = 0; c < data[r].length - 1; c++)
				data[r - 1][c] += Math.max(data[r][c], data[r][c + 1]);

		return data[0][0];
	}

}
