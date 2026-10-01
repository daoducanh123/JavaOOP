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
public class J03013_HieuSonguyenlon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            BigInteger res = x.subtract(y).abs();
            int maxLength = Math.max(x.toString().length(),y.toString().length());
            int resLength = res.toString().length();
            
            int padding = maxLength - resLength;
            
                String resString = res.toString();
            for (int i = 0; i < padding; ++i){
                resString = "0"+ resString;
            }
            
            System.out.println(resString);
        }
    }
}
