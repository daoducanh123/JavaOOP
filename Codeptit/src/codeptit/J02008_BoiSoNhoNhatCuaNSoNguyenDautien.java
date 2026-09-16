package codeptit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAGaming
 */

import java.util.*;
import java.math.BigInteger;

public class J02008_BoiSoNhoNhatCuaNSoNguyenDautien {
    public static BigInteger LCM(BigInteger a, BigInteger b){
        return a.divide(GCD(a, b)).multiply(b);
    }
    public static BigInteger GCD(BigInteger a, BigInteger b){
        while (b.compareTo(BigInteger.ZERO) > 0){ // while (!b.equals(BigInteger.ZERO))
            BigInteger tmp = a;
            a = b;
            b = tmp.mod(b);
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- >0){
            int n = sc.nextInt();
            BigInteger res = BigInteger.ONE;
            for (int i = 1; i <= n; ++i){
                BigInteger x = BigInteger.valueOf(i);
                res = LCM(res, x); // LCM 1 1 -> 1, LCM 1 2 -> 2, LCM 2 3 -> 6, LCM 6 3 -> 12 (12 % 1 2 3 ok)
            }
            System.out.println(res);
        }
    }
    
}
