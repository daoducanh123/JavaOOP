package codeptit;
import java.util.Scanner;

public class J01006_TInhsoFIB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long[] fib = new long[93];
        fib[1] = 1; fib[2] = 1;
        for (int i = 3; i <= 92; ++i){
            fib[i] = fib[i-2] + fib[i-1];
        } 
        while (t > 0) {
            int n = scanner.nextInt();
            System.out.println(fib[n]);


            t--;
        }
        scanner.close();
    }
}