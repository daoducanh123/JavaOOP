package codeptit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAGaming
 */

import java.util.*;

public class J04012_BaiToanTinhCong {
    public static class NhanVien{
        static int cnt = 0;
        String ma ;
        String name, chucVu ;
        int luongCoBan, soNgayCong;
        int bonus;
        int phucap;
        int tongLuong;
        int luongThang;
        
        public NhanVien(String ma, String name, int luongCoBan, int soNgayCong, String chucVu){
            this.ma = ma;
            this.name = name;
            this.luongCoBan = luongCoBan;
            this.soNgayCong = soNgayCong;
            this.chucVu = chucVu;
        }
        public void TinhTien(){
            luongThang = luongCoBan * soNgayCong;
            if (soNgayCong >= 25){
                bonus = luongThang * 20 / 100;
            }
            else if (soNgayCong >= 22 && soNgayCong < 25){
                bonus =  luongThang * 10 / 100;
            }
            else{
                bonus = 0;
            }
            if (chucVu.equals("NV")){
                phucap = 150000;
            }
            else if (chucVu.equals("TP")){
                phucap = 180000;
            }
            else if (chucVu.equals("PGD")){
                phucap = 200000;
            }
            else{
                phucap = 250000;
            }
            
            tongLuong = luongThang + phucap + bonus;
        }
            @Override
            public String toString(){
                
                return this.ma + " " + this.name + " " + this.luongThang +" "+ this.bonus +" "+ this.phucap +" "+ this.tongLuong;
            }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            String name =  sc.nextLine();
            int luongCoBan = sc.nextInt();
            int soNgayCong = sc.nextInt(); 
            sc.nextLine();
            String chucVu = sc.nextLine();
            String ma = String.format("NV%02d", ++NhanVien.cnt);
            NhanVien nhanVien =  new NhanVien(ma, name, luongCoBan, soNgayCong, chucVu);
            nhanVien.TinhTien();
            System.out.println(nhanVien);
    }
}
