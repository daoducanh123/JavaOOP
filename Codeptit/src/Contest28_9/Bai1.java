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
public class Bai1 {
    public static class SanPham{
        public static int cnt = 0;
        private String ma;
        private String name;
        private int soLuong;
        private double gia;
        private String nhaSX;
   
        public SanPham(){
        }
        
        public SanPham(String name, int soLuong,double gia, String nhaSX){
            cnt += 1;
            this.name = name;
            this.soLuong = soLuong;
            this.gia = gia;
            this.nhaSX = nhaSX;
        }
        
        public String getMa(){
            String res = this.nhaSX.toUpperCase();
            res+= "-";
            String cntString = String.format("%03d", SanPham.cnt);
            res+= cntString;
            return res;
            
        }
    
        public double getThanhTien(){
            double res = this.soLuong * this.gia;
            if(this.soLuong < 20){
                return res;
            }
            else{
                res = res - res * 0.1;
                return res;
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String ten;
        String nhaSX;
        int soLuong;
        double gia;
        while (n -->0){
            ten= sc.nextLine();
            nhaSX = sc.nextLine();
            soLuong = Integer.parseInt(sc.nextLine());
            gia = Double.parseDouble(sc.nextLine());
            SanPham p = new SanPham (ten, soLuong, gia, nhaSX);
            System.out.println(p);
        }
        
    }
}
