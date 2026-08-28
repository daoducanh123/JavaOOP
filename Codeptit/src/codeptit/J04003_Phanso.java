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
    
    public static long gcd (long a, long b){
        while (b>0){
            long tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    
    public static class PhanSo{
        private long mau,tu;
        public static long tongTu, tongMau;
        
        public PhanSo(){
            
        }
        
        public PhanSo(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
        }
        
        public static void calculate(PhanSo p, PhanSo q){
            tongMau = p.mau * q.mau;
            tongTu = p.tu * q.mau + q.tu * p.mau;
            
            long GCD = gcd(tongTu,tongMau);
            tongMau /= GCD;
            tongTu /= GCD;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long tuP = sc.nextLong();
        long mauP = sc.nextLong();
        
        long tuQ = sc.nextLong();
        long mauQ = sc.nextLong();
        
        PhanSo p = new PhanSo(tuP, mauP);
        PhanSo q = new PhanSo(tuQ, mauQ);
        
        PhanSo.calculate(p, q);
        System.out.println(String.format("%d/%d", PhanSo.tongTu, PhanSo.tongMau));    
    }
}
