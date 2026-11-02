package Contest_02_11;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAGaming
 */
public class B1_VanDongVien {
    public interface IVanDongVien{
        public boolean isMa(String ma);
        public boolean isSo(String so);
        public double getLuongThucLinh ();
    }
    public static  class VanDongVien  {
        String ma, ten;
        double luong;
        
        public VanDongVien(){
        }
        public VanDongVien(String ma, String ten, double luong){
            this.ma= ma;
            this.ten =ten;
            this.luong = luong;
        }
        public String getMa(){
            return this.ma;
        }
        public String getTen(){
            return this.ten;
        }
        public double getLuong(){
            return this.luong;
        }
        public void setLuong(double luong){
            this.luong=luong;
        }
        public void input(Scanner in){
        }
    }
    
    public static class VDVChay { // extend+implement
        String ma, ten;
        double luong;
        public int cuLy;
        public int soHuyChuong;
        
        public VDVChay(){
            
        }
        public VDVChay (String ma, String ten, int cuLy, int soHuyChuong, double Luong){
            this.ma = ma;
            this.ten = ten;
            this.cuLy = cuLy;
            this.soHuyChuong = soHuyChuong;
            this.luong = luong;
        }
        public void setCuly(int cuLy){
            this.cuLy=cuLy;
        }
        public void setSoHuyChuong (int soHuyChuong){
            this.soHuyChuong = soHuyChuong;
        }
        public int getCuly(){
            return this.cuLy;
        }
        public int getSoHuyChuong(){
            return this.soHuyChuong;
        }
        public void input(Scanner in){
            
        }
      
    }
    public static void main(String[] args) {
        VDVChay a = new VDVChay();
        Scanner in = new Scanner (System.in);
        a.input(in);
        System.out.println(a);
    }
}


abc
vdvc-126
Nguyen Dinh Cuong
200
ab
1500
bb
5
nhap sai
nhap sai
nhap sai
VDVC-126 Nguyen Dinh Cuong 5      900.0
vdvc-126
Nguyen Dinh Cuong
200
ab
1500
bb
2
VDVC-126 Nguyen Dinh Cuong 0      200.0