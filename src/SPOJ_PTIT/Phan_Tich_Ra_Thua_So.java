package SPOJ_PTIT;

import java.util.Scanner;

public class Phan_Tich_Ra_Thua_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n  =  sc.nextLong();
        sc.close();

        primeFactorize(n);
    }

    public static void primeFactorize(long n) {
        if (n % 2 == 0){
            int count = 0;
            while (n % 2 == 0){
                n = n / 2;
                count++;
            }
            System.out.println(2 + " " + count);
        }

        for (int i = 3; i*i <= n; i+=2){
            if (n % i == 0){
                int count = 0;
                while (n % i == 0){
                    n = n / i;
                    count++;
                }
                System.out.println(i + " " + count);
            }
        }

        if (n > 2){
            System.out.println(n + " 1" );
        }
    }
}
