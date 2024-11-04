import java.util.Scanner;

public class Tinhtongcacchusocua_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Kiểm tra nếu input nằm trong khoảng cho phép  
            long n = Long.parseLong(input);
            long sum = 0;

            // Tính tổng các chữ số  
            while (n > 0) {
                sum += n % 10;  // Lấy chữ số cuối cùng  
                n /= 10;         // Loại bỏ chữ số cuối cùng  
            }

            System.out.println( sum);


        scanner.close();
    }
}