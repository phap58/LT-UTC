import java.util.Scanner;

public class Tran_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if ((b > 0 && a > Long.MAX_VALUE - b) || (b < 0 && a < Long.MIN_VALUE - b)) {
            System.out.println("OVERFLOW");
        } else {
            long sum = a + b;
            System.out.println(sum);
        }

        sc.close();
    }
}
