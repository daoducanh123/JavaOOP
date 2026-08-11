/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codeptit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DAGaming
 */

import java.util.Scanner;
public class  J01002_Tongnsonguyenduongdautien{


    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int test = scanner.nextInt();
        while (test > 0){
            long n = scanner.nextLong();
            
            long sum = n*(n+1)/2;
            System.out.println(sum);
            
            test--;
            
        }
        scanner.close();
    }
    
}

    
