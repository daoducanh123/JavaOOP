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
public class J04014_TinhTonaPhanSo {
    public static long gcd(long  a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }
    
    public static class PhanSo{
        private long tu, mau;
        
        public PhanSo(long a, long b){
            this.tu = a;
            this.mau = b;
        }   
        public static void Rutgon(PhanSo p){
            long GCD = gcd (p.tu, p.mau);
            p.tu /= GCD;
            p.mau /= GCD;
 
        }
        
        public PhanSo Tong (PhanSo other){
            PhanSo tong = new PhanSo(0, 1);
            tong.tu = this.tu * other.mau + this.mau * other.tu;
            tong.mau = this.mau * other.mau;
            tong.tu *= tong.tu;
            tong.mau *= tong.mau;
            PhanSo.Rutgon(tong);
            return tong;
        }        
        public PhanSo Nhan (PhanSo p2, PhanSo p3){
            PhanSo nhan = new PhanSo(0, 1);
            nhan.tu = this.tu * p2.tu * p3.tu;
            nhan.mau = this.mau * p2.mau * p3.mau;
            PhanSo.Rutgon(nhan);
            return nhan;
        }
        
    }
    // Thực hiện phép tính C = (A + B)2 và rút gọn kết quả.
    //Thực hiện phép tính D = A x B x C và rút gọn kết quả.
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            PhanSo p1 = new PhanSo(a,b);
            PhanSo p2 = new PhanSo(c,d);
            PhanSo.Rutgon(p1);
            PhanSo.Rutgon(p2);
            
            
            PhanSo p3 = p1.Tong(p2);
            PhanSo p4 = p1.Nhan(p2,p3);
            System.out.print(p3.tu+"/"+p3.mau + " ");
            System.out.print(p4.tu+"/"+p4.mau);            
            System.out.println("");
        }

    }
}
