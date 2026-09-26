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
public class J03025_XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt(); sc.nextLine();
        while (t-->0){
            String s = sc.nextLine();
            int cnt = 0;
            
            int l = 0; int r = s.length()-1;
            while (l < r){
                if (s.charAt(l) != s.charAt(r)){
                    cnt+=1;
                }
                l++; r--;
            }
            
            if (cnt == 1 || cnt == 0 && s.length() % 2 == 1){// cnt = 0 tức là đối xứng sẵn và độ dài lẻ thì chỉ cần đổi thằng giữa thì vẫn tính
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
