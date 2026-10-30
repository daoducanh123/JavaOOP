/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_07_10_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class Bai09_LuaChonThamLam {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        
        if (n == 0|| sum < 1 || sum >9 *n){
            System.out.println("-1 -1");
            return;
        }
        int s = sum;
        StringBuilder min = new StringBuilder();
        
        for (int i = 0; i < n; ++i){
            int remainning= n - 1-i;
            int digit= Math.max(0,s-9 *remainning);
            if (i==0){
                digit = Math .max(1,digit);
            }
            min.append(digit);
            s-= digit;
        }
        s = sum;
        StringBuilder max = new StringBuilder();
        for(int i = 0; i < n; ++i){
            int digit = Math.min(9,s);
            max.append(digit);
            s -= digit;
        }
        System.out.print(min + " ");
        System.out.println(max);
            

    }
}