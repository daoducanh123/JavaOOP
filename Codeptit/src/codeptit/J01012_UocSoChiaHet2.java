package codeptit;
import java.util.Scanner;
public class J01012_UocSoChiaHet2 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int num = 0;

            for (int i = 1; i * i  <= n; ++i){
                if (n % i == 0){
                    if (i % 2 == 0){
                    System.out.println(i);
                    num++;
                    }
                    
                    if ((n/i) % 2 == 0 && i != n / i){
                        num++;
                    }
                }

            }

            System.out.println(num);
            t--;
        }
        sc.close();
    }
}
