/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest28_9;
import java.io.*;
import java.util.*;
/**
 *
 * @author DAGaming
 */
public class Bai2 {
    public static class PhanSo{
        private long tu,mau;
        
        public static long GCD(long a, long b){
            while (b > 0){
                long tmp = a;
                a = b;
                b = tmp % b;
            }
            return a;
        }
        
        public PhanSo(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
        }
        
        public void RutGon(){
            long gcd = GCD (this.tu, this.mau);
            this.tu = this.tu / gcd;
            this.mau = this.mau/gcd;
        }
        
        public PhanSo Nhan (PhanSo other){
            PhanSo res = new PhanSo(0,1);
            res.tu = this.tu * other.tu;
            res.mau = this.mau * other.mau;
            return res;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();
        
        PhanSo a = new PhanSo(tu1, mau1);
        PhanSo b = new PhanSo (tu2, mau2);
        a.RutGon();
        b.RutGon();
        
        PhanSo res = a.Nhan(b);
        res.RutGon();
        if (res.mau == 1){
            System.out.println(res.tu);
        }
        else
        System.out.println(res.tu + "/" + res.mau);
    }
}
