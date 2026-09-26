/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.io.*;
import java.util.*;



/**
 *
 * @author DAGaming
 */
public class J07010_DSachSVienTrongFile2 {
    public static class SinhVien{
        private String msv;
        private String name;
        private String dob;
        private String lop;
        private float Gpa;
        
        static int cnt = 0;

        public SinhVien(String msv, String name, String lop, String dob, float Gpa){
            this.msv = msv;
            this.name = name;
            this.lop = lop;
            this.Gpa = Gpa;
            
            
            this.dob = dob; // 31/01.2006
            String[] DOBStrings =dob.split("/");
            
            this.dob = String.format("%02d/%02d/%s", Integer.parseInt(DOBStrings[0]), Integer.parseInt(DOBStrings[1]), DOBStrings[2]);
        }
        public void in (){
            System.out.print(this.msv + " " + this.name + " " + this.lop + " " + this.dob + " ");
            System.out.printf("%.2f", this.Gpa);
            System.out.println("");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("SV.in");
        Scanner sc = new Scanner(f);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-->0){
            SinhVien.cnt++;
            String msv = String.format("B20DCCN%03d", SinhVien.cnt);
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dob = sc.nextLine();
            String gpa = sc.nextLine();
            Float Gpa = Float.parseFloat(gpa);
            SinhVien svien = new SinhVien(msv,name,lop,dob,Gpa);
            svien.in();
        }
    }
}
