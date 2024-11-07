package SPOJ;

import java.util.Scanner;
import java.util.ArrayList;

public class queue_rookie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of people
            int[] heights = new int[N];
            int[] tallerAhead = new int[N];

            // Reading heights
            for (int i = 0; i < N; i++) {
                heights[i] = scanner.nextInt();
            }

            // Reading taller ahead counts
            for (int i = 0; i < N; i++) {
                tallerAhead[i] = scanner.nextInt();
            }

            // Using an ArrayList to store the final arrangement
            ArrayList<Integer> queue = new ArrayList<>();

            // Insert people based on the taller ahead counts
            for (int i = 0; i < N; i++) {
                // Ensure the index is within bounds
                int index = tallerAhead[i];
                if (index > queue.size()) {
                    index = queue.size();
                }
                queue.add(index, heights[i]);
            }

            // Printing the final arrangement
            for (int height : queue) {
                System.out.print(height + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
