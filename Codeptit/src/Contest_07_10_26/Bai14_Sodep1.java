/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_07_10_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class Bai14_Sodep1 {
    public static boolean chk1(String s){
        char[] charArr = s.toCharArray();
            for (int i = 0; i < charArr.length; ++i){
                if (charArr[i] != charArr[charArr.length-1-i]){
                    return false;
                }
            }
            return true;
    }
    public static boolean chk2(String s){
        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length/2; ++i){
            int num = charArr[i]-'0';
            if (num % 2 == 1){
                return false;

                }
            }
        return true;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();

            if (chk1(s) && chk2(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
