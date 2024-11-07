import java.util.HashSet;
import java.util.Scanner;

public class smol_sudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] grid = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        if (isValidSudoku(grid)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }

        sc.close();
    }

    private static boolean isValidSudoku(int[][] grid) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int number = grid[i][j];

                if (number < 1 || number > 9 || !seenNumbers.add(number)) {
                    return false;
                }
            }
        }
        return true;
    }
}
