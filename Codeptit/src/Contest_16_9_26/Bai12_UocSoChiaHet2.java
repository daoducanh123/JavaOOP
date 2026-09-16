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
public class Bai12_UocSoChiaHet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int cnt = 0;
            for (int i =1; i <= (int)Math.sqrt(n); ++i){
                if (n%i == 0){
                    if (i % 2 ==0){
                        cnt += 1;
                    }
                    if (i != n/i && (n/i) % 2 ==0){
                        cnt+=1;
                    }
                }

            }System.out.println(cnt);
        }
    }
}
