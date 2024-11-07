package SPOJ;
import java.util.Scanner;

public class sum_of_product {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Đọc số test case

        while (T-- > 0) {
            long N = sc.nextLong(); // Đọc giá trị N cho mỗi test case
            long sum = 0;

            long x = 1;
            while (x <= N) {
                long y = N / x; // Tính y = N / x
                long nextX = N / y + 1; // Xác định x tiếp theo mà y thay đổi

                // Số lượng x đóng góp cho y
                long count = nextX - x; // Số lượng x đóng góp cho y

                // Tính tổng đóng góp của tất cả các cặp (x, y) cho giá trị y
                // Công thức: contribution = y * (sum of x values from x to nextX - 1)
                long sumOfX = (count * (x + (nextX - 1)) / 2) % MOD;  // Tổng các giá trị từ x đến nextX-1 (đảm bảo chia cho 2)
                long totalContribution = (y * sumOfX) % MOD; // Tổng đóng góp cho y
                sum = (sum + totalContribution) % MOD; // Cập nhật tổng

                x = nextX; // Chuyển đến giá trị x tiếp theo
            }

            System.out.println(sum); // In kết quả cho test case hiện tại
        }

        sc.close(); // Đóng Scanner sau khi sử dụng xong
    }
}
