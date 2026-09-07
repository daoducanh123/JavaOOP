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
public class NewClass {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    
    int cnt = 0; // dem so
    int cnt2 = 0; // chu thuong
    int cnt3 = 0; // chu hoa
    int cnt4 = 0; // so dau cach
    for (int i = 0; i < st.length(); ++i) {
        char c = st.charAt(i);
        if (Character.isDigit(c)) {
            cnt++;
        }
        else if (Character.isLowerCase(c)) {
            cnt2++;
        }
        else if (Character.isUpperCase(c)) {
            cnt3++;
        }
        else if (c == ' ') {
            cnt4++;
        }
    }
        System.out.println(cnt + " "+cnt2+" " + cnt3 + " " + cnt4);
}
}
    
