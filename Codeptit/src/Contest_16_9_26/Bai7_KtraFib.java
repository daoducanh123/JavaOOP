/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_16_9_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class Bai7_KtraFib {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        long[] fib = new long[93];
        fib[0]=0; fib[1] = 1;
        
        for (int i = 2; i <= 92; ++i){
            fib[i] = fib[i-1] +fib[i-2];
        }
        while (t-->0){
            boolean  ok = false;
                long n = sc.nextLong();
                for (int i = 0; i <= 92; ++i){
                    if (fib[i] == n){
                        ok = true;
                        break;
                    }
                }
                if (!ok){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
        }
        
    }

}

//wa

   //     while (t-->0){
     //       long n = sc.nextLong();
       //     long n1 = 5*n*n+4;
         //   long n2 = 5*n*n-4;
           // long root1 = (long)Math.sqrt(n1);
            //long root2 = (long)Math.sqrt(n2);

          //  if (root1 * root1 == n1 || root2*root2 == n2){
            //    System.out.println("YES");
            //}
            //else{
              //  System.out.println("NO");
            //}
        //}
        
        // WA chascw tran so