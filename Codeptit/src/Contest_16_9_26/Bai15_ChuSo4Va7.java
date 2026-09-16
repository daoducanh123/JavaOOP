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
public class Bai15_ChuSo4Va7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String s =  sc.nextLine();
        int cnt4 = 0;
        int cnt7 = 0;
//        char[] c = s.toCharArray();
        for (int i = 0;i  <= s.length()-1; ++i){
            if (s.charAt(i)=='4'){
                cnt4 +=1;
            }
            else if (s.charAt(i) == '7'){
                cnt7 +=1;
            }
            
        
        }
        if (cnt4 + cnt7 == 4 || cnt4+cnt7 == 7){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
        }
        
    }
}
