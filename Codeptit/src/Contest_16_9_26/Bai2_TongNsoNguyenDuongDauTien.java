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
public class Bai2_TongNsoNguyenDuongDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t =  sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
                long tong = (long)n*(n + 1)/2 ;
                System.out.println(tong);
        }
    }
}
