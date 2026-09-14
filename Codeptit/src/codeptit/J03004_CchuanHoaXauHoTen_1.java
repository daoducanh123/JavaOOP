
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
public class J03004_CchuanHoaXauHoTen_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int test = 0; test < t; ++test){
            String name = sc.nextLine();
            name = name.trim(); // xóa 2 khoảng trắng ở 2 đầu
            name = name.toLowerCase(); // thường hết
            
            String[] nameArr =  name.split("\\s+"); // xóa 1 hoặc nhiều khoảng trắng, endline, tab v.v
            for (int i = 0; i < nameArr.length; ++i){
                char c = nameArr[i].charAt(0);
                c = Character.toUpperCase(c);
                nameArr[i] = c + nameArr[i].substring(1,nameArr[i].length());
            }
                
            for (int i = 0; i < nameArr.length; ++i){
                System.out.print(nameArr[i] + " ");
            }
            System.out.println("");
        }
    }
}
