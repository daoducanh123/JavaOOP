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
public class J02103_TichMatranvoichuyenvi {
    static  int n, m;
    static int[][] arr;
    static int[][] brr;
    static int[][] crr;
    static Scanner sc;
    public static void In (){
        arr = new int[n+1][m+1];
        for (int i = 1; i <= n; ++i){
           for (int j = 1; j <= m; ++j){
               arr[i][j] = sc.nextInt();
           }
       }
    }
    public static void ChuyenVi(){
        brr = new int[m+1][n+1];
        for (int i = 1; i <= m; ++i){
            for (int j = 1; j <= n; ++j){
                brr[i][j] = arr[j][i];
            }
        }
    }
    public static void Nhan(){
        crr = new int [n+1][n+1];
        for (int i = 1; i <= n; ++i){
            for (int j = 1; j <= n; ++j){
                crr[i][j] = 0;
                for (int k = 1; k<=m ;++k){
                    crr[i][j] += arr[i][k] * brr[k][j];
                }
            }
        }
    }
    public static void Print(){
        for (int i = 1; i <= n; ++i){
            for (int j = 1; j<=n ;++j){
                System.out.print(crr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt=1;
        while (t-->0){
            n = sc.nextInt();
            m = sc.nextInt();
            In();
            ChuyenVi();
            Nhan();
            System.out.printf("Test %d:\n",cnt++);
            Print();
        }
    }
}
