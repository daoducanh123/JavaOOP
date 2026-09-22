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

public class Bai10_CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            boolean ok = true;
            // 0189 -> 0100
            // 00000... INVALID & ko tinh 0 o dau
//3
//1890 -> 1000
//3681 -> INVALID
//8919 -> 0010 -> 10
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; ++i){
                if (c[i] != '8' && c[i] != '9' && c[i] != '0' && c[i] != '1'){
                    ok = false;
                    break;
                }
                if (c[i] == '8' || c[i] == '9'){
                    c[i] = '0';
                }
            }
            int pos = -1;
            for (int i = 0; i< c.length; ++i){
                if (c[i] == '1'){
                    pos = i;
                    break;
                }
            }
            if (!ok || pos == -1){
                System.out.println("INVALID");
            }
            else{
                for (int i = pos; i < c.length; ++i){
                    System.out.print(c[i]);
                }
                System.out.println("");
            }
        }
    }
}
