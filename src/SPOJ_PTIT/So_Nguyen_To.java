package SPOJ_PTIT;

import java.util.Scanner;

public class So_Nguyen_To {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        sc.close();

        if (isPrime(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

    public static boolean isPrime(long n) {
        if (n<2) return false;
        if (n==2 || n==3) return true;
        if (n%2 == 0 || n%3 == 0) return false;
        for (long i =5; i*i <=n; i+=6){
            if (n%i == 0 || n % (i+2) ==0) return false;
        }
        return true;
    }
}
