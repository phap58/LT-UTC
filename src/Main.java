import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số nguyên dương n
        long n = scanner.nextLong();


            // Chuyển số n thành chuỗi
            String nStr = String.valueOf(n);
            String reversedStr = new StringBuilder(nStr).reverse().toString();

            // Kiểm tra số thuận nghịch
            if (nStr.equals(reversedStr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        scanner.close();
    }
}