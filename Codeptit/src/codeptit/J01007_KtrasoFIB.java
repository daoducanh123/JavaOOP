package codeptit;

import java.util.Scanner;

public class J01007_KtrasoFIB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        long[] fib = new long[93];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= 92; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        while (t > 0) {
            long n = scanner.nextLong();
            boolean ok = false;

            for (int i = 0; i <= 92; i++) {
                if (n == fib[i]) {
                    ok = true;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");

            t--;
        }

        scanner.close();
    }
}