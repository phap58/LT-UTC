package SPOJ_PTIT;

import java.util.Scanner;

public class So_Doi_Xung {

    // Function to check if a number is a palindrome using arithmetic
    public static boolean isPalindrome(long n) {
        long original = n;
        long reversed = 0;

        // Reverse the number
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        // Check if the original number and the reversed number are the same
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            if (isPalindrome(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}

