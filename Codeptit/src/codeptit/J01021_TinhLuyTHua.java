/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;

public class J01021_TinhLuyTHua {
    public static void main(String[] args) {
        final long mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) break;
            
         
            long res = 1;
            while (b > 0){
               if (b % 2 == 1){
                   res = res * a % mod;
                } 
               a = a * a % mod;
               b /= 2;
            }
            System.out.println(res);
        }
    }
}
