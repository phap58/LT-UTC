import java.util.Scanner;
import java.util.ArrayList;

public class Diem_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result.add(arr[i]);
            }
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
