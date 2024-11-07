//quay lui - TLE(10)
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sinh_cac_xau_dau_ngoac_sai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> results = new ArrayList<>();

        generateAllSequences(n, n, "", results);

        List<String> invalidSequences = new ArrayList<>();
        for (String sequence : results) {
            if (!isValid(sequence)) {
                invalidSequences.add(sequence);
            }
        }

        for (String sequence : invalidSequences) {
            System.out.println(sequence);
        }
        scanner.close();
    }

    private static void generateAllSequences(int open, int close, String current, List<String> results) {
        if (open == 0 && close == 0) {
            results.add(current);
            return;
        }

        if (open > 0) {
            generateAllSequences(open - 1, close, current + "(", results);
        }

        if (close > 0) {
            generateAllSequences(open, close - 1, current + ")", results);
        }
    }

    private static boolean isValid(String sequence) {
        int balance = 0;
        for (char c : sequence.toCharArray()) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }
}
