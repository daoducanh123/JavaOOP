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
public class Bai3_GiaiPTBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ax + b = 0
        // VN 
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a == 0 && b != 0){
            System.out.println("VN");
        }
        else if (a == 0 && b == 0){
            System.out.println("VSN");
        }   
        else{
            double res = -b / a;
            System.out.printf("%.2f", res);
        }
    }
}
