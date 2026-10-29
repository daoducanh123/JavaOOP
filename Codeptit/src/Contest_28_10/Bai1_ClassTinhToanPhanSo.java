/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_28_10;

import java.util.*;
/**
 *
 * @author DAGaming
 */
public class Bai1_ClassTinhToanPhanSo {
    static class phanso{
        long tu,mau;

        public phanso(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
            rutGon();
        }
        long gcd(long a, long b){
            a=Math.abs(a);
            b = Math.abs(b);
        
            while(b!=0){
                long r = a % b;
                a = b;
                b= r;
                
            }return a;
        }
        void rutGon(){
            long g = gcd(tu,mau);
            tu /= g;
            mau /= g;
            if (mau<0){
                tu = -tu;
                mau = -mau;
            }
        }
        phanso cong (phanso b){
            return new phanso(tu *b.mau + b.tu*mau, mau*b.mau);
        }
        phanso binhphuong(){
            return new phanso(tu*tu,mau*mau);
        }
        phanso nhan(phanso b){
            return new phanso(tu*b.tu,mau *b.mau);
        }
        @Override
        public String toString(){
            return tu + "/" +mau;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            phanso aa = new phanso(a, b);
            phanso bb = new phanso(c, d);
            phanso cc = aa.cong(bb).binhphuong();
            phanso dd= aa.nhan(bb).nhan(cc);
            System.out.println(cc+" "+dd);
        }

            

            sc.close();
    }
        
}
