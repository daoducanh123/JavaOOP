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
public class Bai6_TinhFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t= sc.nextInt();
        long[] fib = new long[93];
        fib[1]=1; fib[2] = 1;
        
        for (int i = 3; i <= 92; ++i){
            fib[i] = fib[i-1] +fib[i-2];
        }
        
        while (t-->0){
            int n = sc.nextInt();
            System.out.println(fib[n]);
        }
    }
}
