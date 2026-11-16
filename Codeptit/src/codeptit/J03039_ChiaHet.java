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
public class J03039_ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.mod(b).equals(BigInteger.ZERO)||b.mod(a).equals(BigInteger.ZERO)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
