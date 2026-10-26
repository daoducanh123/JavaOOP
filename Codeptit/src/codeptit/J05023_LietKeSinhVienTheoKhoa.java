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
public class J05023_LietKeSinhVienTheoKhoa {
        public static class SinhVien{
            static int cnt = 0;
            String msv ;
            String name ;
            String lop ;
            String email ;
            int khoaHoc ;

            public SinhVien(String msv, String name, String lop, String email, int khoaHoc){
                this.msv = msv;
                this.name = name;
                this.lop = lop;
                this.email = email;
                this.khoaHoc = khoaHoc;
            }
        
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<SinhVien> listSinhVien = new ArrayList<>();
            while (n-->0){
                String msv = sc.nextLine();
                String name = sc.nextLine();
                String lop = sc.nextLine();
                String email = sc.nextLine();
                int khoaHoc = Integer.parseInt("20"+lop.substring(1,3));
                SinhVien sinhVien = new SinhVien(msv, name, lop, email, khoaHoc);
                listSinhVien.add(sinhVien);
            }
            int m = sc.nextInt();
            while (m-->0){
                int year = sc.nextInt();
                System.out.printf("DANH SACH SINH VIEN KHOA %d:\n", year);
                for (int i = 0; i < listSinhVien.size(); ++i){
                    SinhVien sinhVien = listSinhVien.get(i);
                    if (year == sinhVien.khoaHoc){
                        System.out.println(sinhVien.msv+" "+ sinhVien.name + " " + sinhVien.lop +" " + sinhVien.email);
                    }
                }
            }
        }
}
