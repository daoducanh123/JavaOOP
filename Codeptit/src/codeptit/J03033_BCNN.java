/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author DAGaming
 */
public class J03033_BCNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            
            BigInteger gcd = a.gcd(b);
            BigInteger lcm = a.divide(gcd).multiply(b);
            System.out.println(lcm);
        }
        sc.close();
    }
}
