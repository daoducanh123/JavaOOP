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
public class J01018_SoKoLienKe {
    
    private static boolean chk10 (String n){
        int sum = 0;
            for (int i = 0; i < n.length(); ++i){
                int digit = n.charAt(i)- '0';
                sum += digit;
            }
            return sum % 10 == 0;
    }
    
    private static boolean chk2 (String n){
        for (int i = 1; i < n.length(); ++i){
            double n1 = n.charAt(i) - '0';
            double n2 = n.charAt(i-1) - '0';

            if (Math.abs(n1 - n2) != 2){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int t  = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String n = sc.nextLine();
            boolean ok1 = chk10(n);
            boolean ok2 = chk2(n);
            if (ok1 && ok2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
