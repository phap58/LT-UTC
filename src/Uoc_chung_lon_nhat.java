import java.util.Scanner;

public class Uoc_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long LargestGCD = n / 2;

        System.out.println(LargestGCD);

        sc.close();
    }
}
