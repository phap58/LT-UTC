import java.util.Scanner;

public class Hinh_Chu_Nhat_Don_Sac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc kích thước M và N  
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Đọc dãy số A  
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Tạo bảng màu  
        int[][] grid = new int[M][N];

        // Tô màu cho bảng  
        for (int col = 0; col < N; col++) {
            for (int row = 0; row < M; row++) {
                if (row < A[col]) {
                    grid[row][col] = 1; // Màu hồng  
                } else {
                    grid[row][col] = 0; // Màu xanh  
                }
            }
        }

        // Tính diện tích hình chữ nhật lớn nhất  
        int maxArea = 0;
        for (int row = 0; row < M; row++) {
            int[] heights = new int[N];
            for (int col = 0; col < N; col++) {
                heights[col] = (grid[row][col] == 1) ? heights[col] + 1 : 0;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        // In kết quả  
        System.out.println(maxArea);
    }

    // Hàm tìm diện tích hình chữ nhật lớn nhất trong mảng heights  
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int[] stack = new int[heights.length + 1];
        int top = -1;

        for (int i = 0; i < heights.length; i++) {
            while (top >= 0 && heights[stack[top]] > heights[i]) {
                int h = heights[stack[top--]];
                int w = (top == -1) ? i : i - stack[top] - 1;
                maxArea = Math.max(maxArea, h * w);
            }
            stack[++top] = i;
        }

        while (top >= 0) {
            int h = heights[stack[top--]];
            int w = (top == -1) ? heights.length : heights.length - stack[top] - 1;
            maxArea = Math.max(maxArea, h * w);
        }

        return maxArea;
    }
}