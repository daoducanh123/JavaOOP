/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;

/**
 *
 * @author DAGAMING
 */
public class J03006_SoDep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            boolean ok = true;
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); ++i){
                char c = s.charAt(i);
                if (c == '1' || c == '3' || c == '5' || c== '7' || c == '9'){
                    
                    // if ((c - '0') % 2 != 0)
                    ok = false;
                }
            }
            if (ok){
                
            char[] arr = s.toCharArray();
            int idx = s.length()-1;
            char[] rev_arr = new char[s.length()];
            for (int i = 0; i < s.length();++i){
                rev_arr[i] = arr[idx--];
            }
            for (int i = 0; i < s.length(); ++i){
                if (rev_arr[i] != arr[i]){
                    ok = false;
                    break;
                }
            }
            }
         
            if(ok){
                System.out.println("YES");
                
            }else{
                System.out.println("NO");
            }
        }
    }
}
