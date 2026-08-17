package codeptit;
import java.util.Scanner;

public class J01011_BCNNUCLN {

    static int UCLN(int a, int b){
        while (b != 0){
            
            int tmp = a;
            a = b;
            b = tmp % a;
        }
            return a;
    }

    static long BCNN(int a, int b, int k){
          return (long) a / k * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = UCLN(a,b);
            long m = BCNN(a,b,k);
            System.out.println(m + " " + k);

            test --;

        }
        sc.close();
    }
}
