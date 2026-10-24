/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import  java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

/**
 *
 * @author DAGaming
 */
public class J07046_DanhSachLuuTru {
    public static class Khach{
        static int cnt = 0;
        String ma;
        String name ;
        String maPhong ;
        int ngay;

        public Khach(String ma, String name, String maPhong, int ngay) {
            this.ma = ma;
            this.name = name;
            this.maPhong = maPhong;
            this.ngay = ngay;
        }
        
        
    }
    
    public static void main(String[] args) throws Exception{
        File f = new File ("KHACH.in");
        Scanner sc = new Scanner(f);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> listKhach = new ArrayList<>();
        for (int i = 0; i < n; ++i){
            Khach.cnt += 1;
            String ma = String.format("KH%02d", Khach.cnt);
            String name = sc.nextLine();
            String maPhong = sc.nextLine();
            String strNgayDen = sc.nextLine();
            String strNgayDi = sc.nextLine();
            LocalDate ngayDen = LocalDate.parse(strNgayDen.trim(), fmt);
            LocalDate ngayDi = LocalDate.parse(strNgayDi.trim(), fmt);
            int ngay = (int)ChronoUnit.DAYS.between(ngayDen, ngayDi);
            Khach khach = new Khach(ma, name, maPhong, ngay);
            listKhach.add(khach);
        }
        listKhach.sort((a,b)-> Integer.compare(b.ngay, a.ngay));
        for (int i = 0; i < n; ++i){
            Khach khach = listKhach.get(i);
            System.out.println(khach.ma + " " + khach.name+" "+ khach.maPhong+ " "+ khach.ngay);
        }
    }
}
