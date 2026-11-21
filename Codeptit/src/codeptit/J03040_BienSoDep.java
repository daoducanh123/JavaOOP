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
public class J03040_BienSoDep {
    public static boolean Check(String s) {
    String ss = s.substring(5).replace(".", "");
    String ss1 = ss.substring(0, 3);
    String ss2 = ss.substring(3);

    boolean ok1 = true, ok2 = true, ok3 = true, ok4 = true;

    // Cả 5 chữ số được sắp theo thứ tự tăng chặt từ trái qua phải
    for (int i = 0; i < ss.length() - 1; ++i) {
        char c = ss.charAt(i);
        char cc = ss.charAt(i + 1);

        int num1 = c - '0';
        int num2 = cc - '0';

        if (num2 <= num1) {
            ok1 = false;
            break;
        }
    }
    if (ok1) return true;

    // Cả 5 chữ số đều bằng nhau
    char c = ss.charAt(0);
    for (int i = 1; i < ss.length(); ++i) {
        if (ss.charAt(i) != c) {
            ok2 = false;
            break;
        }
    }
    if (ok2) return true;

    // 3 số đầu giống nhau, 2 số cuối giống nhau
    if (ss1.charAt(0) == ss1.charAt(1) && ss1.charAt(1) == ss1.charAt(2)
            && ss2.charAt(0) == ss2.charAt(1)) {
        return true;
    }

    // Chỉ gồm số 6 và 8
    for (int i = 0; i < ss.length(); ++i) {
        char x = ss.charAt(i);
        if (x != '6' && x != '8') {
            ok4 = false;
            break;
        }
    }
    if (ok4) return true;

    return false;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if (Check(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
