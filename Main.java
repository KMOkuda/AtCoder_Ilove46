import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxValue = 45;
		long dp[][] = new long[3][maxValue + 1];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < n; j++) {
				int mod46 = sc.nextInt() % 46;
				if (i == 0) {
					dp[i][mod46]++;
				} else {
					for (int k = 0; k <= maxValue; k++) {
						if (dp[i - 1][k] > 0) {
							dp[i][(k + mod46) % 46] += dp[i - 1][k];
						}
					}
				}
			}
		}
		System.out.println(dp[2][0]);
	}
}
