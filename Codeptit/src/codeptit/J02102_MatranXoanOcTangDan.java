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
public class J02102_MatranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            int [][] matran = new int[n][n];
            int [] arr = new int[n*n];
            for (int i = 0; i < n*n; ++i){
                int x = sc.nextInt();
                arr[i] = x;
            }
            Arrays.sort(arr);
            int idx = 0;
            
            int row1 = 0;
            int row2 = n-1;
            int col1 = 0;
            int col2 = n-1;
            while (row1 <= row2 && col1 <= col2){
                for (int c = col1; c <= col2; ++c){
                    matran[row1][c] = arr[idx];
                    idx += 1;
                }
                row1+=1;
                
                for (int r = row1; r <= row2; ++r){
                    matran[r][col2] = arr[idx];
                    idx+=1;
                }
                col2-=1;
                
                if (row1 <= row2){
                    for (int c = col2; c >= col1; --c){
                        matran[row2][c] = arr[idx];
                        idx+=1;
                    }
                    
                }
                row2 -= 1;
                if (col1 <= col2){
                    for (int r = row2; r >= row1; --r){
                        matran[r][col1] = arr[idx];
                        idx+=1;
                    }
                    
                }
                col1 += 1;
                
            }
            
        // In ma trận
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(matran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
