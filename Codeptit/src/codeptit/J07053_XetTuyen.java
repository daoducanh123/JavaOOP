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
public class J07053_XetTuyen {
    public static class ThiSinh{
        static int cnt = 0;
        String ma ;
        String name ;
        String dob;
        int age ; // 2021-nam sinh
        double d1,d2,gpa;
        String ranking ;
        String diemIn;

        public ThiSinh(String ma, String name, String dob, double d1, double d2) {
            this.ma = ma;
            this.name = name;
            this.dob = dob;
            this.d1= d1;
            this.d2= d2;
        }
        
        public void TinhDiem(){
            this.gpa = this.d1 + this.d2;
            this.gpa /=2;
            if (d1 >= 8 && d2 >= 8){
                gpa += 1;
            }
            else if(d1 >= 7.5 && d2 >= 7.5){
                gpa += 0.5;
            }
            // làm tròn 1 chữ số vd 3.19 -> 3.2
            this.gpa = Math.round(this.gpa) ;
            
            if (this.gpa > 10){
                this.gpa = 10.0;
            }
            // bỏ số .0 vd 3.0 -> 3
             diemIn = (gpa == (int) gpa)
            ? String.valueOf((int) gpa)
            : String.valueOf(gpa);
        }
        public void Ranking() {
            if (gpa < 5) {
                ranking = "Truot";
            } else if (gpa < 7) {
                ranking = "Trung binh";
            } else if (gpa < 8) {
                ranking = "Kha";
            } else if (gpa < 9) {
                ranking = "Gioi";
            } else {
                ranking = "Xuat sac";
            }
        }
        
        public void ChuanHoaTen (){
            String[] arrName = name.trim().toLowerCase().split("\\s+");
            for (int i = 0; i < arrName.length; ++i){
                char c = arrName[i].charAt(0);
                c = Character.toUpperCase(c);
                arrName[i] = c + arrName[i].substring(1);
            }
            this.name = String.join(" ", arrName);
        }
        public void ChuanHoaDob (){
            //: dd/mm/yyyy
            String[] arrDob = dob.trim().split("/");
            int date = Integer.parseInt(arrDob[0]);
            int month = Integer.parseInt(arrDob[1]);
            int year = Integer.parseInt(arrDob[2]);
            dob = String.format("%02d/%02d/%04d",date,month,year);
            this.age = 2021-year;
        }
        
    }
    public static void main(String[] args) throws Exception{
        // diem thuong
        // xep loai
        
        File f = new File("XETTUYEN.in");
        Scanner sc = new Scanner(f);
        
        int n = Integer.parseInt(sc.nextLine());
            ArrayList<ThiSinh> list = new ArrayList<>();
        while (sc.hasNextLine()){
            ThiSinh.cnt += 1;
            String ma = String.format("PH%02d", ThiSinh.cnt);
            String name = sc.nextLine();
            String dob = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            
            ThiSinh thiSinh = new ThiSinh(ma, name, dob, d1, d2);
            thiSinh.ChuanHoaDob();
            thiSinh.ChuanHoaTen();
            thiSinh.TinhDiem();
            thiSinh.Ranking();
            list.add(thiSinh);
        }
        for (int i = 0; i < n; ++i){
            ThiSinh thiSinh = list.get(i);
            System.out.println(thiSinh.ma + " " + thiSinh.name + " " + thiSinh.age + " " + thiSinh.diemIn + " " + thiSinh.ranking);
        }
    }
}
