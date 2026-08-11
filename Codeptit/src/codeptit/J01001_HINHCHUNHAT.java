/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;
import java.util.Scanner;
/**
 *
 * @author DAGaming
 */
public class J01001_HINHCHUNHAT {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        if (length <= 0 || width <= 0){
            System.out.println(0);
        }
        else{

            int p = (length + width) * 2;
            int a = length * width;
            System.out.println(p + " " + a);
        }


        scanner.close();
    }
    
}
