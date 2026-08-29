/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;
/**
 *
 * @author DAGaming
 */
public class J01017_Solienke {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- >0){
            String s = sc.next();
            boolean ok = true;
            for (int i = 1; i < s.length(); ++i){
                if (Math.abs(s.charAt(i) - s.charAt(i-1)) != 1){
                    ok = false;
                    break;
                }
            }
            System.out.println(ok? "YES":"NO");
        }
       sc.close();
    }
}
