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
    public static int gcd (int a, int b){
        while (b > 0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
    
    public static class PhanSo{
        private int tu, mau;
        
        public PhanSo(int a, int b){
            this.tu = a;
            this.mau = b;
        }   
        public static void Rutgon(PhanSo p){
            int GCD = gcd (p.tu, p.mau);
            p.tu /= GCD;
            p.mau /= GCD;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        PhanSo p = new PhanSo(a,b);
        PhanSo.Rutgon(p);
        System.out.println(p.tu + "/" + p.mau);
    }
}
