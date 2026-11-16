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
public class J03024_SoUuThe {
    public static boolean ChkInvalid(String s){
            if (s.charAt(0) == '0'){
                return true;
            }
            for (int i = 0;i < s.length();++i){
                if(!Character.isDigit(s.charAt(i))){
                    return true;
                }
            }
            return false;
    }
    public static boolean Check(String s){
        int c = 0;
        int l = 0;
        if (s.length() % 2 == 0){
            c= 1;
        }else l = 1;
        
        int cntc= 0; int cntle=0;
        for (int i = 0; i < s.length(); ++i){
            int num = s.charAt(i) - '0';
            if (num % 2 ==0){
                cntc +=1;
            }
            else cntle += 1;
        }
        
        
        if (cntc>cntle && c == 1 || cntle > cntc && l == 1){
            return true;
        }return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-->0){
            String s  = sc.nextLine();
            if (ChkInvalid(s)){
                System.out.println("INVALID");
                continue;
            }
            
            if (Check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
