/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.math.BigInteger;
/**
 *
 * @author DAGaming
 */
public class J03011_UCLNSONGUYENLON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-->0){
            String num1 = sc.next();
            String num2 = sc.next();
            
            BigInteger a = new BigInteger(num1);
            BigInteger b = new BigInteger(num2);
            
            BigInteger gcd = a.gcd(b);
            System.out.println(gcd);
        }
    }
}
