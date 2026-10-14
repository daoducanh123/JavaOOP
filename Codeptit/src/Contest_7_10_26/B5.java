/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_7_10_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class B5 {
   public static long ucln(long a, long b){
       while(b!=0){
           long r = a%b;
           a=b;
           b= r;
           
       }
       return a;
   } 
   public static  long bcnn(long a, long b){
       return a/ ucln(a, b) * b;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while (x<=t){
            int n = sc.nextInt();
            long ans = 1;
            for(int i = 2;i  <= n; ++i){
                ans = bcnn (ans,i);
            }
                System.out.println(ans);
            x++;
        }
    }
}
