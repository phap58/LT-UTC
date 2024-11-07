import java.util.*;

public class Sap_Xep_Diem {
    static class Point {
        int x, y, z;

        Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            points.add(new Point(x, y, z));
        }

        points.sort(Comparator.comparingInt((Point p) -> p.x)
                .thenComparingInt(p -> p.y)
                .thenComparingInt(p -> p.z));

        for (Point p : points) {
            System.out.println(p.x + " " + p.y + " " + p.z);
        }

        scanner.close();
    }
}