import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chu_Cho_Scooby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] stones = new int[n];

        for (int i = 0; i < n; i++) {
            stones[i] = scanner.nextInt();
        }

        minJumps(stones);
        scanner.close();
    }

    private static void minJumps(int[] stones) {
        if (stones[0] == 1 || stones[stones.length - 1] == 1) {
            System.out.println("khong qua duoc suoi");
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean[] visited = new boolean[stones.length];
        visited[0] = true;
        int jumps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                if (current == stones.length - 1) {
                    System.out.println(jumps);
                    return;
                }

                if (current + 1 < stones.length && stones[current + 1] == 0 && !visited[current + 1]) {
                    visited[current + 1] = true;
                    queue.add(current + 1);
                }

                if (current + 2 < stones.length && stones[current + 2] == 0 && !visited[current + 2]) {
                    visited[current + 2] = true;
                    queue.add(current + 2);
                }
            }
            jumps++;
        }

        System.out.println("khong qua duoc suoi");
    }
}