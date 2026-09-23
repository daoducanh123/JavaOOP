/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class J02106_MatranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n  = sc.nextInt();
        int [][] arr = new int [n+1][4];
        int cnt =0;
        
        for (int i = 1; i <= n; ++i){
            for (int j = 1; j <= 3; ++j){
                int x= sc.nextInt();
                arr[i][j] = x;
            }
        }
        
        for (int i = 1; i <= n; ++i){
            int cnt1 = 0;
            int cnt0 = 0;
            for (int j = 1; j <= 3; ++j){
                if (arr[i][j] == 1){
                    cnt1+=1;
                }
                else{
                    cnt0+=1;
                }
            }
            if (cnt1>cnt0) cnt+=1;
            
        }
        System.out.println(cnt);
    }
}
