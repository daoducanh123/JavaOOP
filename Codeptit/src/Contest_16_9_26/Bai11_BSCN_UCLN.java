/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_16_9_26;
import java.util.*;

/**
 *
 * @author DAGAMING
 */
public class Bai11_BSCN_UCLN {
    static long GCD (long a, long b){
        while (b != 0){
            long tmp = a;
            a = b;
            b = tmp % a;
        }
        return a;
    }
    static long LCM (long a, long b){
        return a / GCD(a,b) *b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-->0){
           long a = sc.nextLong();
           long b = sc.nextLong();
           long gcd = GCD(a,b);
           long lcm = LCM(a,b);
            System.out.println(lcm + " "+gcd);
        }
    }
}
