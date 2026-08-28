/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;

/**
 *
 * @author DAGaming
 */
public class J04006_KhaiBaoLopSinhVien {
    public static class SinhVien{
        String msv, name, lop, dob;
        float gpa;

        public SinhVien(){
            msv = name = lop = dob = "";
            gpa = 0f;
            
        }
        
        public void in(Scanner sc){
            name = sc.nextLine();
            lop = sc.nextLine();
            dob = sc.nextLine();
            String[] arr = dob.split("/");

            dob = String.format("%02d/%02d/%s",
            Integer.parseInt(arr[0]),
            Integer.parseInt(arr[1]),
            arr[2]);
            gpa = sc.nextFloat();
        }
        public void out(){
            System.out.printf("B20DCCN001" + " " + name + " " + lop + " " + dob + " "+ "%.2f", gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        SinhVien a = new SinhVien();
        a.in(sc);
        a.out();
    }
}
