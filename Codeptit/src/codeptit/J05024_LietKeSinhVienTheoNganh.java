/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class J05024_LietKeSinhVienTheoNganh {
   public static class SinhVien{
       String ma , name, lop , email ;
       String nganh = "";
        public SinhVien(String ma, String name, String lop, String email) {
            this.ma = ma;
            this.name = name;
            this.lop = lop;
            this.email = email;
        }
        
        public void in(){
            System.out.println(ma + " " + name + " " + lop + " " + email);
        }
        
   // Kế toán – mã sinh viên có cụm ký tự DCKT
   // Công nghệ thông tin – mã sinh viên có cụm DCCN – trừ đi các sinh viên lớp bắt đầu bằng chữ E
   // An toàn thông tin – mã sinh viên có cụm DCAT – trừ các sinh viên lớp bắt đầu bằng chữ E
   // Viễn thông – mã sinh viên có cụm DCVT
   // Điện tử - mã sinh viên có cụm DCDT
        public void Nganh(){
            if (this.ma.contains("DCKT")){
                this.nganh = "KE TOAN";
            }
            else if (this.ma.contains("DCCN") && this.lop.charAt(0) != 'E'){
                this.nganh = "CONG NGHE THONG TIN";
            }
            else if (this.ma.contains("DCAT") && this.lop.charAt(0) != 'E'){
                this.nganh = "AN TOAN THONG TIN";
            }
            else if (this.ma.contains("DCVT")){
                this.nganh = "VIEN THONG";
            }
            else if (this.ma.contains("DCDT")){
                this.nganh = "DIEN TU";
            }
        }
        public boolean Check (String nganhCheck){
            if (this.nganh.equals(nganhCheck)){
                return true;
            }return false;
        }
   }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        
        while (n-->0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien sinhVien = new SinhVien(ma, name, lop, email);
            sinhVien.Nganh( );
            listSinhVien.add(sinhVien);
        }   
            
            int q = Integer.parseInt(sc.nextLine());
            while (q-->0){
                String nganh = sc.nextLine().toUpperCase();
                System.out.printf("DANH SACH SINH VIEN NGANH %s:", nganh);
                System.out.println("");
                for (int i = 0; i < listSinhVien.size();++i){
                    SinhVien sinhVien = listSinhVien.get(i);
                    if (sinhVien.Check(nganh)){
                        sinhVien.in();
                    }
                }
            }
    }
}
