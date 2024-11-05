package SPOJ;

import java.util.HashSet;
import java.util.Scanner;

public class rectamgles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Biến để đếm số lượng diện tích khác nhau
        int count = 0;

        // Duyệt qua tất cả các chiều dài và chiều rộng từ 1 đến 6
        for (int length = 1; length <= n; length++) {
            for (int width = length; width <= n; width++) { // Điều kiện width >= length để tránh trùng diện tích
                int area = length * width;

                // Kiểm tra nếu diện tích nằm trong phạm vi từ 1 đến 6
                if (area >= 1 && area <= n) {
                    count++;  // Tăng số lượng diện tích
                }
            }
        }

        // In kết quả
        System.out.println( count);

    }
}
