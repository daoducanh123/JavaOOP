/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
/**
 *
 * @author DAGaming
 */
public class J04013_BaiToanTuyenSinh {
    
    public static String convertString(double number){
        String res = "";
        if (number == (int)number){
            res = String.valueOf((int)number);
        }
        else{
            res = String.valueOf(number);
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String kvuc = ma.substring(2,3);
        double uuTien = 0;
        String name = sc.nextLine();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        double sum = d1*2 + d2 + d3;
        switch (kvuc) {
            case "1":
                uuTien = 0.5;
                break;
            case "2":
                uuTien = 1;
                break;
            case "3":
                uuTien = 2.5;
                break;
            default:
                break;
        }
        String trangThai = "";
        if (sum + uuTien < 24){
            trangThai = "TRUOT";
        }
        else{
            trangThai = "TRUNG TUYEN";
        }
        
        String sumString = convertString(sum);
        String uuTienString = convertString(uuTien);

        System.out.println(ma + " " + name + " " + uuTienString + " " + sumString + " " + trangThai);
    }
    
}
