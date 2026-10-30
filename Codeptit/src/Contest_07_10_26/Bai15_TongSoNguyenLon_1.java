/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_07_10_26;
import java.util.*;
import java.math.BigInteger;
/**
 *
 * @author DAGAMING
 */
public class Bai15_TongSoNguyenLon_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            
            System.out.println(x.add(y));
        }
    }
}
