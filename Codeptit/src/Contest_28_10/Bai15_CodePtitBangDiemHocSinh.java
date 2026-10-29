/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_28_10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAGaming
 */
public class Bai15_CodePtitBangDiemHocSinh {
        static int n;
        static ArrayList<HocSinh> listHocSinh;
        public static class HocSinh{
            static int cnt = 0;
            String msv;
            String name;
            double dtb;
            String rank;

            public HocSinh(String name, double dtb){
                this.name = name;
                this.dtb = dtb;
            }
            
            public void Ranking() {
                if (dtb < 5) {
                    rank = "YEU";
                } else if (dtb < 7) {
                    rank = "TB";
                } else if (dtb < 8) {
                    rank = "KHA";
                } else if (dtb < 9) {
                    rank = "GIOI";
                } else {
                    rank = "XUAT SAC";
                }
            }

            public void MSV(){
                this.msv = String.format("HS%02d", HocSinh.cnt);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            n = sc.nextInt(); sc.nextLine();
            listHocSinh = new ArrayList<>();
            while (n-->0){
                String name = sc.nextLine();
                double[] arrGpa = new double[10];
                double sum = 0f;
                for (int i = 0; i < 10; ++i){
                    arrGpa[i]= sc.nextDouble();
                    sum+= arrGpa[i];
                } sc.nextLine();
                sum = sum + arrGpa[0] + arrGpa[1];
                double dtb = Math.round(sum / 12 * 10) / 10.0;


                HocSinh.cnt+=1;
                HocSinh hocSinh = new HocSinh(name, dtb);
                hocSinh.MSV();
                hocSinh.Ranking();
                listHocSinh.add(hocSinh);
            }

            listHocSinh.sort((a,b)-> a.msv.compareTo(b.msv));
            listHocSinh.sort((a,b) -> Double.compare(b.dtb, a.dtb));

            for (int i = 0; i < listHocSinh.size(); ++i){
                HocSinh hs = listHocSinh.get(i);
                System.out.printf("%s %s %.1f %s%n",
                                    hs.msv, hs.name, hs.dtb, hs.rank);
            }
        }
}
