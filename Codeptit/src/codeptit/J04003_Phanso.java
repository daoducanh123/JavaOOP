/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;
/**
 *
 * @author DAGaming
 */


public class J04003_Phanso {
    public static class PhanSo{
        private int mau,tu;
        
        public PhanSo(int tu, int mau){
            this.tu = tu;
            this.mau = mau;
        }
        
        public int calculate(){
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tuP = sc.nextInt();
        int mauP = sc.nextInt();
        
        int tuQ = sc.nextInt();
        int mauQ = sc.nextInt();
                
        PhanSo p = new PhanSo(tuP, mauP);
        PhanSo q = new PhanSo(tuQ, mauQ);

    }
}
