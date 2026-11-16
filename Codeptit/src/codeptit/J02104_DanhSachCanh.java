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
public class J02104_DanhSachCanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] arr = new int[n+1][n+1];
            for (int i = 1; i <= n; ++i){
                for (int j = 1; j <= n ;++j){
                    arr[i][j] =sc.nextInt();
                }
            }
            
            for (int i = 1; i <= n; ++i){
                for (int j = 1; j <= n ;++j){
                    if (arr[i][j] == 1 && i < j){
                        System.out.printf("(%d,%d)", i, j);
                        System.out.println("");
                    }
                    
                }
            }
        
    }
}
