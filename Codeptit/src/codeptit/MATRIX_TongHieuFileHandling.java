/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author DAGaming
 */
public class MATRIX_TongHieuFileHandling {
    public static class classMaTran{
        private int m;
        private int n;
        int[][] matrix;
        
        public classMaTran(int m, int n){
            this.m = m;
            this.n = n;
            this.matrix = new int [m][n];
        }
        
        public void Read(Scanner sc){
            for (int i = 0; i < m; ++i){
                for (int j = 0; j < n; ++j){
                    this.matrix[i][j]= sc.nextInt();
                }
            }
        }
        
        public classMaTran Add(classMaTran otherMaTran){
            classMaTran maTranTong = new classMaTran(m,n);
            for (int i = 0; i < m; ++i){
                for (int j = 0; j < n ;++j){
                    maTranTong.matrix[i][j] = this.matrix[i][j] + otherMaTran.matrix[i][j];
                }
            }
            return maTranTong;
        }
        
        public classMaTran Sub(classMaTran otherMaTran){
            classMaTran maTranHieu = new classMaTran(m,n);
            for (int i = 0; i < m; ++i){
                for (int j = 0; j < n ;++j){
                    maTranHieu.matrix[i][j] = this.matrix[i][j] - otherMaTran.matrix[i][j];
                }
            }
            return maTranHieu;
        }
        
        public void Write (String fileName) throws FileNotFoundException{
            PrintWriter writer = new PrintWriter(fileName);
            for (int i = 0; i< m; ++i){
                for (int j = 0 ;j < n; ++j){
                    writer.print(this.matrix[i][j]+ " ");
                }
                writer.println();
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File ("Mt.data");
        Scanner sc = new Scanner(f);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        classMaTran A = new classMaTran(m,n);
        classMaTran B = new classMaTran(m,n);
        
        A.Read(sc);
        B.Read(sc);
        
        
        classMaTran tong = A.Add(B);
        classMaTran hieu = A.Sub(B);
        
        tong.Write("tong.txt");
        hieu.Write("hieu.txt");
        
        sc.close();
    }
}
