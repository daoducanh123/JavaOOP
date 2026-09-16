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
public class J03005_ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String name = sc.nextLine();
            name = name.trim();
            name = name.toLowerCase();
            
            String[] nameArr = name.split("\\s+");
            
            for (int i = 0; i < nameArr.length; ++i){
                char c = nameArr[i].charAt(0);
                c = Character.toUpperCase(c);
                nameArr[i] = c + nameArr[i].substring(1,nameArr[i].length());
                
            }
            for (int i = 1; i < nameArr.length; ++i){
                System.out.print(nameArr[i]);
                if (i != nameArr.length-1)
                System.out.print(" ");
            }
            nameArr[0] = nameArr[0].toUpperCase();
            System.out.print(", "+ nameArr[0]);  
           
            System.out.println("");
        }
    }
}
