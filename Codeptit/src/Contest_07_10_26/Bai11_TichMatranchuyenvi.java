/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_07_10_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class Bai11_TichMatranchuyenvi {
    static int n,m;
    static int [][] matran;
    static int [][] matran2;
    static int [][] res;
    public static void ChuyenVi(){
        for (int i = 1; i <= m; ++i){
            for (int j = 1; j <= n; ++j){
                matran2[i][j] = matran[j][i];
            }
        }
    }
    public static void Nhan(){
        for (int i = 1; i <= n; ++i){
            for (int j = 1; j <= n; ++j){
                res[i][j] = 0;
                for (int k = 1; k <= m ;++k){
                    res[i][j] += matran[i][k] * matran2[k][j];
                }
            }
        }
         for (int i = 1; i <= n; ++i){
            for (int j = 1; j <= n; ++j){
                System.out.print(res[i][j] + " ");
            }
             System.out.println("");
        } 
         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tt = 1; tt <= t; ++tt){
            
            n = sc.nextInt();
            m = sc.nextInt();
            matran = new int[n+1][m+1];
            matran2 = new int[m+1][n+1];
            res = new int[n+1][n+1];
            
            // input matran
            for (int i = 1; i <= n; ++i){
                for (int j = 1; j <= m; ++j){
                    int x = sc.nextInt();
                    matran[i][j] = x;
                }
            }
            
            System.out.printf("Test %d:\n", tt);
            ChuyenVi();
            Nhan();
        }
        
        
    }
}
