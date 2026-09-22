
package codeptit;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class MATRIX_TongHieuFileHandling {
    public static class Matrix{
        private int m;
        private int n;
        private int[][] value;
        
        public Matrix(int m, int n){
            this.m = m;
            this.n = n;
            this.value = new int [m][n];
        }
        
        // Đọc value từng thằng
        public void Read(Scanner sc){
            for (int i = 0; i < m; ++i){
                for (int j = 0; j < n; ++j){
                    this.value[i][j] = sc.nextInt();
                }
            }
        }
        
        public Matrix Tong(Matrix other){
            Matrix tong = new Matrix (m,n);
            
            for (int i = 0; i < m; ++i){
                for (int j = 0; j < n; ++j){
                    tong.value[i][j] = this.value[i][j] + other.value[i][j];
                }
            }
            return tong;
        }
            
        public Matrix Hieu(Matrix other){
            Matrix hieu = new Matrix (m,n);
            
            for (int i = 0; i < m; ++i){
                for (int j = 0; j < n; ++j){
                    hieu.value[i][j] = this.value[i][j] - other.value[i][j];
                }
            }
            return hieu;
        }
        
        public  void Write1(PrintWriter writer1){
            for (int i = 0; i < m; ++i){
                for (int j = 0; j < n; ++j){
                    writer1.print(this.value[i][j] + " ");

                }
                writer1.println();
            }
            
        }
        public  void Write2(PrintWriter writer2){
            for (int i = 0; i < m; ++i){
                for (int j = 0; j < n; ++j){
                    writer2.print(this.value[i][j] + " ");
                }
                writer2.println();
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        // Write
        PrintWriter writer1 = new PrintWriter("tong.txt");
        PrintWriter writer2 = new PrintWriter("hieu.txt");

        // Read
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        // → đọc số đầu tiên trong file.
        int m = sc.nextInt();
        // → đọc số T2 trong file.
        int n = sc.nextInt();
        
        Matrix a = new Matrix (m,n);
        Matrix b = new Matrix (m,n);
        
        // Lấy value
        a.Read(sc);
        b.Read(sc);
       
        // Tong
        Matrix tong = a.Tong(b);
        
        // Hieu
        Matrix hieu = a.Hieu(b);
        
        // Ghi
        tong.Write1(writer1);
        hieu.Write2(writer2);
        
        writer1.close();
        writer2.close();
        sc.close();
    }
    
}
