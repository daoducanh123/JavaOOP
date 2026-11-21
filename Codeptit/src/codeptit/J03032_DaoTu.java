/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author DAGaming
 */
import java.util.*;
public class J03032_DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        while (n-->0){
            String s = sc.nextLine();
            String[] arr = s.trim().split("\\s+");
            for (int i = 0; i < arr.length; ++i){
                String tmp = arr[i];
                for (int k = tmp.length()-1; k >= 0; --k){
                    System.out.print(tmp.charAt(k));
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
