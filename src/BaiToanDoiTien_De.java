import java.util.Scanner;

public class BaiToanDoiTien_De {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of denominations and desired amount  
        int n = scanner.nextInt();
        int M = scanner.nextInt();

        // Input the denominations  
        int[] denominations = new int[n];
        for (int i = 0; i < n; i++) {
            denominations[i] = scanner.nextInt();
        }

        // Call the function to find the minimum number of bills needed  
        int result = minCoins(denominations, n, M);

        // Print the result  
        System.out.println(result);
    }

    public static int minCoins(int[] denominations, int n, int M) {
        // Create an array to store minimum coins for each value from 0 to M  
        int[] dp = new int[M + 1];

        // Initialize dp array  
        for (int i = 1; i <= M; i++) {
            dp[i] = Integer.MAX_VALUE; // Set to maximum value  
        }

        // Base case  
        dp[0] = 0;

        // Compute minimum coins for all values from 1 to M  
        for (int i = 1; i <= M; i++) {
            for (int j = 0; j < n; j++) {
                if (denominations[j] <= i) {
                    int subResult = dp[i - denominations[j]];
                    if (subResult != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], subResult + 1);
                    }
                }
            }
        }

        // If dp[M] is still maximum value, no solution was found  
        return dp[M] == Integer.MAX_VALUE ? -1 : dp[M];
    }
}