package codeptit;

import java.util.Scanner;

public class J01009_TongGiaiThua {
    static void factorial(long a[],int n){
        a[1] = 1;
        a[0] = 1;
        
        for (int i = 2; i <= n; ++i){
            a[i] = a[i-1] * i;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[30];
        factorial(a, n);
        long sum = 0;
        for (int i = 1; i <= n; ++i){
            sum += a[i];
        }
        System.out.println(sum);
        sc.close();
    }
}



//        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();

//        long fact = 1;
//        long sum = 0;

//        for (int i = 1; i <= n; i++) {
//            fact *= i;
//            sum += fact;
//        }

//        System.out.println(sum);

//        sc.close();