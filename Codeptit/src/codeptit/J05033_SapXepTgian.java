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
public class J05033_SapXepTgian {
    public static class Tgian{
        int gio,phut,giay;
        public Tgian(int gio, int phut, int giay){
            this.gio = gio;
            this.phut = phut; 
            this.giay = giay;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        ArrayList<Tgian> arrayList = new ArrayList<>();
        while (t-->0){
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            Tgian tgian = new Tgian (gio,phut,giay);
            arrayList.add(tgian);
        }
        arrayList.sort((tgian1, tgian2) -> Integer.compare(tgian1.giay, tgian2.giay));
        arrayList.sort((tgian1, tgian2) -> Integer.compare(tgian1.phut, tgian2.phut));
        arrayList.sort((tgian1, tgian2) -> Integer.compare(tgian1.gio, tgian2.gio));
        
        for (int i = 0; i < arrayList.size(); ++i){
            System.out.println(arrayList.get(i).gio + " " + arrayList.get(i).phut + " " + arrayList.get(i).giay);
        }

    }
}
