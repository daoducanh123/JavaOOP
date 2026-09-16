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
public class Bai8_PhanTichThuaSoNTO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while(t-->0){
            System.out.print("Test "+test+": ");
            test +=1;
            int n = sc.nextInt();
            for (int i = 2; i <= (int)Math.sqrt(n); ++i){
                int cnt = 0;
                if (n % i == 0){
                    System.out.print(i);
                while (n % i == 0){
                    n /= i;
                    cnt+=1;
                }
                System.out.print("(" + cnt + ") ");
                }
            }
            if (n  > 1){
                System.out.print(n+"(1)");
            }
            System.out.println("");
        }
    }
}
