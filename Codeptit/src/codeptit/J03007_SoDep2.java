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
public class J03007_SoDep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            Boolean ok = false;
            String s = sc.nextLine();
            int n = s.length() - 1;
            if (s.charAt(0) == s.charAt(n) && s.charAt(0) == '8'){
                ok = true;
            }
            else{
                ok = false;
            }
            if (!ok){
                System.out.println("NO");
                continue;
            }
            // sum
            int sum = 0;
            for (int i = 0; i <= n; ++i){
                int number = s.charAt(i) - '0';
                sum += number;
            }
            if (sum % 10 != 0){
                ok = false;
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
