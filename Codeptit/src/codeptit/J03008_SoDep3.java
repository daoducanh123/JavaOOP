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
public class J03008_SoDep3 {
        public static boolean check(int n){
             if (n < 2) return false;
             else{
                 for (int i = 2; i * i <= n;++i){
                     if (n%i == 0){
                         return false;
                     }
                 }
             }
             return true;
         }
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            Boolean ok = true;
            String s = sc.nextLine();
            int n = s.length() - 1;

       
            // nto
            for (int i = 0; i <= n; ++i){
                int number = s.charAt(i) - '0';
                if (!check(number)){
                    ok = false;
                    break;
                }
            }
            
            if(!ok){
                System.out.println("NO");
                continue;
            }
            
            // palindrome
            int l = 0; int r = n;
            while (l < r){
                if (s.charAt(l++) != s.charAt(r--)){
                    ok = false;
                    break;
                }
            }
            if (ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
