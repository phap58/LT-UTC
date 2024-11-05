import java.util.*;

public class nqson_OCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng người
        int n = scanner.nextInt();
        int[] heights = new int[n];

        // Đọc chiều cao của từng người
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        // Gọi hàm để đếm và in ra kết quả
        int[] result = countTallerPeople(heights);
        for (int count : result) {
            System.out.print(count + " ");
        }

        scanner.close();
    }

    private static int[] countTallerPeople(int[] heights) {
        int n = heights.length;
        int[] result = new int[n];

        // Tạo một bản sao để sắp xếp chiều cao
        int[] sortedHeights = Arrays.copyOf(heights, n);
        Arrays.sort(sortedHeights);

        // Sử dụng HashMap để lưu trữ số lượng người cao hơn cho mỗi chiều cao
        Map<Integer, Integer> tallerCountMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int height = sortedHeights[i];
            // Số lượng người cao hơn được tính là tổng số người trừ số lượng index hiện tại
            if (!tallerCountMap.containsKey(height)) {
                tallerCountMap.put(height, n - i - 1);
            }
        }

        // Đếm số người cao hơn cho từng chiều cao trong mảng gốc
        for (int i = 0; i < n; i++) {
            result[i] = tallerCountMap.get(heights[i]);
        }

        return result;
    }
}