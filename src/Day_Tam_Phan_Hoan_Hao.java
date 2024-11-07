import java.util.*;

public class Day_Tam_Phan_Hoan_Hao {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N < 1 || N > 15) {
            System.out.println(-1);
            return;
        }

        generateTernaryStrings("", N);

        if (count == 0) {
            System.out.println(-1);
        }
        scanner.close();
    }

    private static void generateTernaryStrings(String current, int length) {
        if (current.length() == length) {
            int count0 = 0, count1 = 0, count2 = 0;
            for (char c : current.toCharArray()) {
                if (c == '0') count0++;
                else if (c == '1') count1++;
                else count2++;
            }

            if (count0 == count1 && count1 == count2) {
                count++;
                System.out.println(current);
            }
            return;
        }

        generateTernaryStrings(current + "0", length);
        generateTernaryStrings(current + "1", length);
        generateTernaryStrings(current + "2", length);
    }
}