/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
/**
 *
 * @author DAGaming
 */
public class J01022_XauNhiPhan {
    public static void Fib(long[] fibLen){
        fibLen[1] = 1;
        fibLen[2] = 1;
        for (int i = 3; i <= 92; ++i){
            fibLen[i] = fibLen[i-1]+fibLen[i-2];
        }
    }
          // len   //n
    // 0     1       1
    // 1     1       2
    // 01    2       3
    // 101   3       4
    // 01101 5       5
    // 10101101 8    6
    //    k=4 ->0
    //     
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        long [] fibLen = new long[93];
        Fib(fibLen);
        
        while (t-- > 0 ){
            int n = sc.nextInt();
            long k = sc.nextLong();
            
            
            // Muốn tìm K trong X[N]:
            while (n > 2){
              // thuộc về n-1
              if (k > fibLen[n-2]){
                  k = k - fibLen[n-2];
                  n -= 1;
              } 
              // thuộc về n-2
              else if (k <= fibLen[n-2]){
                  n -= 2;
              }
            }
            if (n == 1) System.out.println(0);
            else System.out.println(1);
            
        }
        sc.close();
    }
}
