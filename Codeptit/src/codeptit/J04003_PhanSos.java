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
public class J04003_PhanSos {

        public static class PhanSo{
            private long tu;
            private long mau;

        public PhanSo(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
        }
        
        public long GCD (long tu, long mau){
            while (mau != 0){
                long tmp = tu;
                tu = mau;
                mau = tmp % mau;
            }
            return tu;
        }
        
        public void RutGon(){
            long gcd = GCD(this.tu, this.mau);
            this.tu /= gcd;
            this.mau /= gcd;
        }
        
        public void in (){
            System.out.println(this.tu+"/" +this.mau);
        }
    }   
    
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        PhanSo phanSo = new PhanSo(tu,mau);
        phanSo.RutGon();
        phanSo.in();
    }
}
