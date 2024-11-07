import java.util.Arrays;
import java.util.Scanner;

public class Cua_Hang_keo {
    public static int maxBags(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int[] bags = {6, 9, 20};

        for (int i = 1; i <= n; i++) {
            for (int bag : bags) {
                if (i >= bag && dp[i - bag] != -1) {
                    dp[i] = Math.max(dp[i], dp[i - bag] + 1);
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int result = maxBags(n);
        System.out.println(result);
    }
}
