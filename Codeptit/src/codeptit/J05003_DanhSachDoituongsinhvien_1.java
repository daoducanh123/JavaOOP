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
public class J05003_DanhSachDoituongsinhvien_1 {
    public static class SinhVien{
        static int cnt = 0;
        String msvString;
        String name, dobString, lopString;
        float gpa;
        
        public SinhVien(){
            msvString = "";
            name = dobString = lopString = "";
            gpa = 0f;
        }
        public SinhVien(String name, String lopString, String dobString, Float gpa){
            this.name = name;
            this.lopString = lopString;
            this.dobString = dobString;
            this.gpa = gpa;
            this.msvString = String.format("B20DCCN%03d", SinhVien.cnt);
        }
        
        public static void In(ArrayList<SinhVien> listSinhViens){
            for (int i = 0; i < listSinhViens.size(); ++i){
                SinhVien a =listSinhViens.get(i);
                System.out.printf(a.msvString + " " + a.name+ " " + a.lopString + " "+ a.dobString + " " + "%.2f", a.gpa);
                System.out.println("");
            }
        }
        
        public void DOB(){

            String[] arrDobString = this.dobString.split("/");
            int date = Integer.parseInt(arrDobString[0]);
            int month = Integer.parseInt(arrDobString[1]);
            int year = Integer.parseInt(arrDobString[2]);
            this.dobString = String.format("%02d/%02d/%04d", date,month,year);
            
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        ArrayList<SinhVien> listSinhViens = new ArrayList<>();
        while (n -->0){
            String name = sc.nextLine();
            String lopString = sc.nextLine();
            String dob = sc.nextLine();
            Float gpa = sc.nextFloat(); sc.nextLine();
            SinhVien.cnt += 1;
            SinhVien a = new SinhVien(name,lopString,dob,gpa);
            a.DOB();
            listSinhViens.add(a);
        }
        SinhVien.In(listSinhViens);
    }
}
