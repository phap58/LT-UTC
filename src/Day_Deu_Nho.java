import java.util.Scanner;

public class Day_Deu_Nho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Mảng position lưu trữ vị trí của mỗi phần tử trong dãy A
        int[] position = new int[n+1]; // Mảng để lưu vị trí của phần tử
        for (int i = 0; i < n; i++) {
            position[A[i]] = i;
        }

        int steps = 1; // Khởi tạo số bước là 1
        int lastPos = position[1]; // Lưu vị trí của phần tử 1 (phần tử đầu tiên trong dãy)

        for (int i = 2; i <= n; i++) {
            // Kiểm tra nếu vị trí của phần tử hiện tại không liên tiếp với phần tử trước đó
            if (position[i] < lastPos) {
                steps++; // Nếu không liên tiếp thì tăng số bước
            }
            lastPos = position[i]; // Cập nhật lại vị trí cuối cùng
        }

        System.out.println(steps);
    }
}
