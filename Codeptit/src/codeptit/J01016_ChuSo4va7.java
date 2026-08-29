/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;
/**
 *
 * @author DAGaming
 */
public class J01016_ChuSo4va7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String string_n = String.valueOf(n);
        int cnt4 = 0; int cnt7 = 0;
        for (int i = 0; i < string_n.length(); ++i){
            if (string_n.charAt(i) == '4'){
            cnt4++;
        }
            else if (string_n.charAt(i) == '7'){
                    cnt7++;
            }
        }
        int total = cnt4 + cnt7;
        if (total == 4 || total == 7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        sc.close();
    }
}
