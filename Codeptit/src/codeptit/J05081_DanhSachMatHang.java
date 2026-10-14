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
public class J05081_DanhSachMatHang {
    public static class MatHang{
        static int cnt = 0;
        String maString, tenString, donviString;
        int giaMua, giaBan, loiNhuan;
        
        public MatHang (String maString, String tenString, String donViString, int giaMua, int giaBan, int loiNhuan){
            this.maString = maString;
            this.tenString = tenString;
            this.donviString = donViString;
            this.giaBan = giaBan;
            this.giaMua = giaMua;
            this.loiNhuan = loiNhuan;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(); sc.nextLine();
        ArrayList<MatHang> listMatHang = new ArrayList<>();
        while (n-->0){
            MatHang.cnt ++;
            String maString = String.format("MH%03d", MatHang.cnt);
            String tenString = sc.nextLine();
            String donViString = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();
            sc.nextLine();
            int loiNhuan = giaBan - giaMua; 
            MatHang matHang = new MatHang(maString, tenString, donViString, giaMua, giaBan, loiNhuan);
            
            listMatHang.add(matHang);

        }
        listMatHang.sort((a, b) -> a.maString.compareTo(b.maString));
        listMatHang.sort((a,b) -> Integer.compare(b.loiNhuan, a.loiNhuan));

        for (int i = 0; i < listMatHang.size(); ++i){
            MatHang a = listMatHang.get(i);
            System.out.println(a.maString + " " + a.tenString + " " + a.donviString + " " + a.giaMua + " " + a.giaBan + " " + a.loiNhuan);
        }
    }
}
