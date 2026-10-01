import java.util.*;

public class Main {

    static class Point {
        private double x, y;

        public Point() {
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point(Point p) {
            this.x = p.x;
            this.y = p.y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double distance(Point p) {
            return Math.sqrt(
                (x - p.x) * (x - p.x)
                + (y - p.y) * (y - p.y)
            );
        }

        public static double distance(Point p1, Point p2) {
            return p1.distance(p2);
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            Point A = new Point(sc.nextDouble(), sc.nextDouble());
            Point B = new Point(sc.nextDouble(), sc.nextDouble());
            Point C = new Point(sc.nextDouble(), sc.nextDouble());

            double a = A.distance(B);
            double b = B.distance(C);
            double c = C.distance(A);

            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("INVALID");
            } else {
                // Công thức Heron
                double p = (a + b + c) / 2;

                double area = Math.sqrt(
                        p * (p - a) * (p - b) * (p - c)
                );

                System.out.printf("%.2f%n", area);
            }

        }

        sc.close();
    }
}