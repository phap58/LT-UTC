package SAMSUNG;

import java.util.Scanner;

public class PRIME1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){

            int m = sc.nextInt();
            int n = sc.nextInt();

            for (int i =m ; i<=n ; i++){
                if (isPrime(i)){
                    System.out.println(i);
                }
            }

        }

    }

    public static boolean isPrime(int i){
        if (i <= 1){
            return false;
        }
        for (int j = 2; j*j <= i; j++){
            if (i % j  == 0){
                return false;
            }
        }
        return true;
    }

    }

