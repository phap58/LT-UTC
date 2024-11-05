/*Print all integers ai such that ai is divisible by x and not divisible by y, where 1 < ai < n < 100000.

Input
First, you are given t (t < 100) - the number of test cases. In each of the following t lines, 3 integers: n x y.

You might assume also that x < n and x is not divisible by y.

        Output
In each of the following t lines, numbers requested in the problem description in the separated by a single space in ascending order.

Example
Input:
        2
        7 2 4
        35 5 12
Output:
        2 6
        5 10 15 20 25 30*/
/*
package SPOJ;

import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();


            for (int i = 2; i < n; i++) {
                if (i % x == 0 && i % y != 0) {
                    System.out.printf("%d ", i);
                }
            }
            System.out.println();

        }
        sc.close();
    }
}*/

package SPOJ;
import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Số test case

        while (t-- > 0) {
            int n = sc.nextInt();  // Giới hạn trên của ai
            int x = sc.nextInt();  // Chia hết cho x
            int y = sc.nextInt();  // Không chia hết cho y

            boolean found = false; // Cờ để kiểm tra có tìm thấy kết quả hay không

            // Lặp qua các giá trị từ 2 đến n - 1 (theo yêu cầu bài toán)
            for (int i = 2; i < n; i++) {
                if (i % x == 0 && i % y != 0) {
                    if (found) {
                        System.out.print(" "); // In khoảng trắng giữa các số
                    }
                    System.out.print(i);
                    found = true; // Đã tìm thấy ít nhất 1 số thỏa mãn
                }
            }

            // Nếu có ít nhất 1 số thoả mãn, in kết quả
            if (found) {
                System.out.println();
            } else {
                System.out.println();  // In dòng trống nếu không có số thoả mãn
            }
        }

        sc.close();
    }
}

