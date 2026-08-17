/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author DAGAMING
 */



public class J01010_CatDoi {
    
    public static boolean check(String s){
        if (!s.contains("1")) return false;
        
        for (int i = 0; i < s.length(); ++i){
            if (s.charAt(i) - '0' != 0 && s.charAt(i) - '0' != 1 && s.charAt(i) - '0' != 8 && s.charAt(i) - '0' != 9){
                return false;
            }
        }
            
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t>0){
            String s;
            boolean okFirst = false;
            s = sc.nextLine();
            if (check(s)){
                for (int i = 0; i < s.length(); ++i){
                    if (s.charAt(i) == '1'){
                        okFirst = true;
                        System.out.print(1);
                    }
                    if ((s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0') && okFirst){
                        System.out.print(0);
                    } 
                }
            }
            else{
                System.out.print("INVALID");
            }
            
            System.out.println("");
            
            sc.close();
            t --;
        }
        
    }
    
        
    
}
