import java.util.*;

public class Lien_Lac {
    private static List<List<Integer>> graph;
    private static boolean[] visited;
    private static int[] trust;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        trust = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            trust[i] = scanner.nextInt();
        }

        graph = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        visited = new boolean[N + 1];
        List<Integer> initialStudents = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                List<Integer> group = new ArrayList<>();
                bfs(i, group);
                int maxTrust = -1;
                int bestStudent = -1;
                for (int student : group) {
                    if (trust[student] > maxTrust) {
                        maxTrust = trust[student];
                        bestStudent = student;
                    }
                }
                initialStudents.add(bestStudent);
            }
        }

        Collections.sort(initialStudents);

        System.out.println(initialStudents.size());
        for (int student : initialStudents) {
            System.out.print(student + " ");
        }
    }

    // Hàm BFS để tìm và thu thập các học sinh trong nhóm liên thông
    private static void bfs(int start, List<Integer> group) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        group.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                    group.add(neighbor);
                }
            }
        }
    }
}
