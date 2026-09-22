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
public class Bai9_TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long tong = 0;
        long gthua = 1;
        // 3 = 1 + 1*2 + 1*2*3
        for (int i = 1; i <= n; ++i){
            gthua *= i;
            tong += gthua;
        }
        System.out.println(tong);
    }
}
