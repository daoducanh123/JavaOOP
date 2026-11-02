package Contest_02_11;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAGaming
*/
import java.util.*;
import java.io.*;

public class B2_MatSoDTH0odau {
    public static class SinhVien{
        String ma,name,lop,email,sdt;
        public SinhVien(String ma, String name, String lop ,  String email , String sdt){
            this.ma = ma;
            this.name = name;
            this.lop = lop;
            this.email = email;
            this.sdt = sdt;
        }
    }
    public static void main(String[] args) throws Exception{
        // nho sc.nextLine
        
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        File f = new File("DANHSACH.in");
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()){
            String ma = sc.nextLine();
            String name =sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            SinhVien sinhVien = new SinhVien(ma,name,lop,email,"0"+sdt);
            listSinhVien.add(sinhVien);
        }
        listSinhVien.sort((a,b)->a.ma.compareTo(b.ma));
        listSinhVien.sort((a,b)-> a.lop.compareTo(b.lop));
        for (int i = 0; i < listSinhVien.size();++i){
            SinhVien sinhVien = listSinhVien.get(i);
            System.out.println(sinhVien.ma+ " " + sinhVien.name + " "+sinhVien.lop + " "+ sinhVien.email+" " +sinhVien.sdt);
        }
    }
}
