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
public class NewClass1 {
    public static class SinhVien{
        public String name;
        public String msv;
        public float gpa;
        
        
        public SinhVien(){
        }
        
        public SinhVien(String name, String msv, float gpa){
            this.name = name;
            this.msv = msv;
            this.gpa = gpa;
        }
        
        public void input(Scanner sc){

            System.out.print("Nhap ten: ");
            name = sc.nextLine();

            System.out.print("Nhap MSV: ");
            msv = sc.nextLine();

            System.out.print("Nhap GPA: ");
            gpa = sc.nextFloat();
            
            sc.nextLine(); 

        }
        public void output(){
            System.out.println(
                "Ten: " + name +
                " | MSV: " + msv +
                " | GPA: " + gpa
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();
        while (true){
            System.out.println("Xin moi nhap input");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){

                    case 1:
                        System.out.println("Nhap SV");
                        SinhVien a = new SinhVien();
                        a.input(sc);
                        listSinhVien.add(a);

                        break;

                    case 2:
                        String nameToFind = sc.nextLine();

                        for (int i = 0; i < listSinhVien.size();++i){
                            if (listSinhVien.get(i).name.contains(nameToFind)){
                                System.out.println(listSinhVien.get(i).name);
                            }
                        }
                        
                        break; 
                        
                    case 3:
                        for (int i = 0; i < listSinhVien.size(); ++i){
                            listSinhVien.get(i).output();
                        }
                        
                        break;

                    case 4:
                        Comparator <SinhVien> cmp = (sinhVien1, sinhVien2)->Float.compare(sinhVien1.gpa, sinhVien2.gpa);
                        listSinhVien.sort(cmp);
                        
                        for (SinhVien sv : listSinhVien) {
                            sv.output();
                        }

                        break;

                    default:
                        sc.close();
                        
                        return;

            }
        }
        
    }
}
