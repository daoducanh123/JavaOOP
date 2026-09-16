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
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dai = sc.nextInt();
        int rong = sc.nextInt();
        if (dai <= 0 || rong <= 0){
            System.out.println(0);
        }
        else{
            long chuVi = (dai + rong) * 2;
            long dienTich = dai * rong;
            System.out.println(chuVi + " " + dienTich);
        }
    }
}
