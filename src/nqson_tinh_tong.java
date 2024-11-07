import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class nqson_tinh_tong {
   public static void searchByHashSet(long[] array, long t) {
    /*    Set<Long> set = new HashSet<>();

        for (long number : array) set.add(number);

        for (long x : array) {
            long y = t - x;
            if (x != y && set.contains(y) && x < y) {
                System.out.println("" + x + " " + y);
                return;
            }
        }*/

       for (long a : array) {
           for (long b : array) {
               if (a != b && a + b == t && a < b) {
                   System.out.println("" + a + " " + b);
                   return;
               }
           }
       }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }

        searchByHashSet(array, x);

        sc.close();

    }
}
