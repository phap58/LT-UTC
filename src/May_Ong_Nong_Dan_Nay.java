import java.util.Arrays;
import java.util.Scanner;

public class May_Ong_Nong_Dan_Nay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N and C  
        int N = scanner.nextInt();
        int C = scanner.nextInt();

        // Read positions  
        int[] positions = new int[N];
        for (int i = 0; i < N; i++) {
            positions[i] = scanner.nextInt();
        }

        Arrays.sort(positions);

        int left = 1;
        int right = positions[N - 1] - positions[0];
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canPlaceCows(positions, N, C, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }

    private static boolean canPlaceCows(int[] positions, int N, int C, int distance) {
        int count = 1;
        int lastPosition = positions[0];

        for (int i = 1; i < N; i++) {
            if (positions[i] - lastPosition >= distance) {
                count++;
                lastPosition = positions[i];
            }
            if (count >= C) {
                return true;
            }
        }

        return false;
    }
}