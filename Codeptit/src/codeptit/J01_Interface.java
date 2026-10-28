/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
/**
 *
 * @author DAGaming
 */
public class J01_Interface {
    public static interface Luong{
        void tinhLuong();
    }
    public static class NhanVien implements Luong{
        String maNv ;
        String name ;
        double luongCoBan ;
        double luong ;
        String loai; 
        
        public NhanVien(String maNv , String name , double luongCoBan, String loai){
            this.maNv = maNv;
            this.name = name;
            this.luongCoBan = luongCoBan;
            this.loai = loai;
        }
        public void tinhLuong(){
        }
        

        @Override
        public String toString() {
            return String.format("%s %s %.0f %s",
                                 maNv, name, luong, loai);
        }
        
    }
    
    public static class NhanVienFullTime extends NhanVien{
        double tienThuong;
        
        public NhanVienFullTime (String maNv , String name , double luongCoBan, String loai, double tienThuong){
            super(maNv, name, luongCoBan,loai);
            this.tienThuong = tienThuong;
        } 
        
        @Override
        public void tinhLuong(){
            this.luong = this.luongCoBan + this.tienThuong;
        }
        
    }
    public static class NhanVienPartTime extends NhanVien{
        int soGio;
        public NhanVienPartTime (String maNv , String name , double luongCoBan, String loai , int soGio){
            super(maNv, name, luongCoBan, loai);
            this.soGio = soGio;
        } 
        
        @Override
        public void tinhLuong(){
            this.luong = soGio * 50000.0;
        }
    }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<NhanVien> listNhanVien = new ArrayList<>();
            for (int i = 1; i <= n; ++i){
                int c = Integer.parseInt(sc.nextLine());
                String maNv = sc.nextLine();
                String name = sc.nextLine();
                double luongCoBan = Double.parseDouble(sc.nextLine());
                String loai ="";
                double tienThuong = 0.0;
                int soGio = 0;
                if (c == 1){
                    loai = "FullTime";
                    tienThuong = Double.parseDouble(sc.nextLine());
                    NhanVienFullTime nhanVienFullTime = new NhanVienFullTime(maNv, name, luongCoBan, loai, tienThuong);
                    nhanVienFullTime.tinhLuong();
                    listNhanVien.add(nhanVienFullTime);

                }
                else if(c == 2){
                    loai = "PartTime";
                    soGio = Integer.parseInt(sc.nextLine());
                    NhanVienPartTime nhanVienPartTime = new NhanVienPartTime(maNv, name, luongCoBan, loai, soGio);
                    nhanVienPartTime.tinhLuong();
                    listNhanVien.add(nhanVienPartTime);
                }
            }
            
            for (NhanVien nv : listNhanVien) {
               System.out.println(nv);
            }
        }
}
