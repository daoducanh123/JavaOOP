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
public class J04007_KhaiBaoLopNhanVien {
     static class NhanVien{
        static int cnt;
        String mnv, name, dob, sex, address, mst, contractDate;
        
        public NhanVien(String name, String sex, String dob, String address, String mst, String contractDate){
                NhanVien.cnt += 1;
                this.name = name;
                this.sex = sex;
                this.dob = dob;
                this.address = address;
                this.mst = mst;
                this.contractDate = contractDate;
                
                
        }
        public void MNV(){
            this.mnv = String.format("%05d", cnt);
        }
        public void DOB(String dob){
            // 31-01-2006
            String[] arrDate = dob.split("/");
            this .dob = String.format ("%02d/%02d/%04d", Integer.parseInt(arrDate[0]), Integer.parseInt(arrDate[1]), Integer.parseInt(arrDate[2]));
            
        }
        public void CONTRACTDATE(String contractDate){
            // 31-01-2006
            String[] arrDate = contractDate.split("/");
            this.contractDate = String.format ("%02d/%02d/%04d", Integer.parseInt(arrDate[0]), Integer.parseInt(arrDate[1]), Integer.parseInt(arrDate[2]));
            
        }
        public void IN(){
            System.out.println(this.mnv + " " + this.name + " " + this.sex + " " + this.dob + " " + this.address + " " + this.mst+ " " + this.contractDate);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String dob = sc.nextLine();
        String address = sc.nextLine();
        String mst = sc.nextLine();
        String contractDate = sc.nextLine();


        NhanVien a = new NhanVien( name, sex, dob, address, mst, contractDate);
        a.MNV();
        a.DOB(dob);
        a.CONTRACTDATE(contractDate);
        
        a.IN();
    }
}
