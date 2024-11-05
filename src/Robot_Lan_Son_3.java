import java.util.Scanner;

public class Robot_Lan_Son_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] paint = new int[m + 1];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
           paint[a]++;
           if (b + 1 <= m){
               paint[b]--;
           }
        }

        int res = 0, cnt = 0;
        for (int i = 0; i < m; i++) {
            cnt += paint[i];

            if (cnt >= k) {
                res++;
            }
        }

        System.out.println(res);
        scanner.close();
    }
}