import java.util.*;

public class HoaDoiNhoNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int minSwaps = Math.min(findMinSwaps(arr, true), findMinSwaps(arr, false));

        System.out.println(minSwaps);

        scanner.close();
    }

    private static int findMinSwaps(int[] arr, boolean ascending) {
        int n = arr.length;
        int[] sortedArr = arr.clone();

        Arrays.sort(sortedArr);
        if (!ascending) {
            for (int i = 0; i < n / 2; i++) {
                int temp = sortedArr[i];
                sortedArr[i] = sortedArr[n - 1 - i];
                sortedArr[n - 1 - i] = temp;
            }
        }

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(sortedArr[i], i);
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || indexMap.get(arr[i]) == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = indexMap.get(arr[j]);
                cycleSize++;
            }
            if (cycleSize > 0) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }
}