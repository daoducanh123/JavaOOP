/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.io.*;
/**
 *
 * @author DAGaming
 */
public class J07033_DanhSachSinhVienTrongFile_1 {
    
    public static class SinhVien{
        String msv,name,lop,email;
        
        public SinhVien(String msv, String name, String lop, String email){
            this.msv = msv;
            this.name = name;
            this.lop = lop;
            this.email = email;
        }
        public void ChuanHoa(){
            String[] arrName = name.trim().toLowerCase().split("\\s++");
            for (int i = 0; i < arrName.length; ++i){
                char c = arrName[i].charAt(0);
                c = Character.toUpperCase(c);
                arrName[i]  = c + arrName[i].substring(1);
            }
            this.name = String.join(" ", arrName);
        }
    }
    public static void main(String[] args)throws Exception {
        File f = new File ("SINHVIEN.in");
        Scanner sc = new Scanner (f);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        for (int t = 1; t <= n; ++t){
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien sinhVien = new SinhVien(msv,name,lop,email);
            sinhVien.ChuanHoa();
            listSinhVien.add(sinhVien);
            
        }
        listSinhVien.sort((a,b)->a.msv.compareTo(b.msv));
        for (int i = 0; i < listSinhVien.size(); ++i){
            SinhVien sv = listSinhVien.get(i);
            System.out.printf("%s %s %s %s", sv.msv, sv.name, sv.lop, sv.email);
            System.out.println("");
        }
        
    }
}
