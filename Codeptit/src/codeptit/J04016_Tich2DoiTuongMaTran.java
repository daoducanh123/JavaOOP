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
public class J04016_Tich2DoiTuongMaTran {
    public static class Matrix{
        int n,m;
        int [][] arr;
    
        public Matrix(int n, int m){
            this.n = n;
            this.m = m;
            arr = new int[n][m];
        
        }
        
        public void nextMatrix(Scanner sc){
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j){
                    this.arr[i][j] = sc.nextInt();
                }
            }
        }
        public Matrix mul (Matrix other){
            Matrix res = new Matrix (this.n, other.m);
            for (int i = 0; i < this.n; ++i){
                for (int j = 0; j < other.m ; ++j){
                    res.arr[i][j] = 0;
                    for (int k = 0; k < this.m; ++k){
                        res.arr[i][j] += this.arr[i][k] * other.arr[k][j];
                    }
               
                }
            }
            return res;
        }
        @Override 
        public String toString(){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n;++i){
                for (int j = 0; j < m; ++j){
                    if (j > 0) sb.append(" ");
                    sb.append(this.arr[i][j]);
                    
                }
                    if (i < n -1) sb.append("\n");
            }
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix (n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix (sc);
        System.out.println(a.mul(b));
    }
}
