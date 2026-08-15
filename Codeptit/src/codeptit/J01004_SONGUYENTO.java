package codeptit;

import java.util.Scanner;

public class J01004_SONGUYENTO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0){
            boolean ok = true;
            int n = scanner.nextInt();
            for (int i = 2;  i * i <= n; ++i){
                if (n % i == 0){
                    ok = false;
                    break;
                }
            }
            if (!ok){
                System.out.println("NO");
            }
            else System.out.println("YES");

            test --;
        }
        scanner.close();
    }
}

