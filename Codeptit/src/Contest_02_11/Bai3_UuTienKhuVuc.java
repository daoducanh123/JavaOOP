/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_02_11;
import java.util.*;
/**
 *
 * @author DAGaming
 */
public class Bai3_UuTienKhuVuc {
    public static class ThiSinh{
        String ma , name, danToc;
        double tongDiem; // ko tinh uu tien, 1 so thap phan
        int giai;
        double ketQua;
        
        double diemUuTien;
        String khuVuc;
        String trangThai; // TRUNG TUYEN || TRUOT tinh ca uutien
        String strDiemUuTien;
        String strTongDiem;
        
        public ThiSinh(String ma, String name, String danToc , double tongDiem,
                int giai)
        {
                this.ma = ma;
                this.name = name;
                this.danToc = danToc;
                this.tongDiem = tongDiem;
                this.giai = giai;
        }
        public void sua(){
            if (tongDiem == (int)tongDiem){
                this.strTongDiem= String.valueOf((int)tongDiem);
            }
            else{
                this.strTongDiem = String.format("%.1f", tongDiem);
            }
            if (diemUuTien == (int)diemUuTien){
                this.strDiemUuTien = String.valueOf((int)diemUuTien);
            }
            else{
                this.strDiemUuTien = String.format("%.1f", diemUuTien);
            }
        }
     
     
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        ArrayList<ThiSinh> listThiSinh = new ArrayList<>();
        while (n-->0){  
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String danToc = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            double tongDiem = toan+ly+hoa;
            int giai = Integer.parseInt(sc.nextLine());
            ThiSinh thiSinh = new ThiSinh(ma, name, danToc, tongDiem, giai);
            
            // Tim khu vuc (3 chu cai dau ma thi sinh)
            thiSinh.khuVuc = ma.substring(0,3); 
            thiSinh.diemUuTien = 0.0;
            if (thiSinh.khuVuc.equals("KV1")){
                thiSinh.diemUuTien += 0.0;
            }
            else if (thiSinh.khuVuc.equals("KV2")){
                thiSinh.diemUuTien += 1.0;
            }
            else if (thiSinh.khuVuc.equals("KV3")){
                thiSinh.diemUuTien += 2.0;
            }
            // Uu tien cho dan toc != "kinh"
            if (!thiSinh.danToc.equals("kinh")){
                thiSinh.diemUuTien += 1.0;
            }
            // Uu tien cho giai quoc gia
            if (thiSinh.giai == 1){
                thiSinh.diemUuTien += 1.5;
            }
            else if (thiSinh.giai == 2){
                thiSinh.diemUuTien += 1.0;
            }
            else if (thiSinh.giai == 3){
                thiSinh.diemUuTien += 0.5;
            }
            
            // Diem chuan la  26.8
            // Xac dinh trung tuyen hay truot
            thiSinh.ketQua  = thiSinh.tongDiem + thiSinh.diemUuTien;
            if (thiSinh.tongDiem + thiSinh.diemUuTien < 26.8){
                thiSinh.trangThai = "TRUOT";
            }
            else{
                thiSinh.trangThai = "TRUNG TUYEN";
            }
            
            // List Thi Sinh
                        thiSinh.sua();

            listThiSinh.add(thiSinh);
        }
            // sort
            listThiSinh.sort((a,b)-> Double.compare(b.tongDiem, a.tongDiem));
            listThiSinh.sort((a,b)-> Double.compare(b.ketQua, a.ketQua));
             // in
            for (int i = 0; i < listThiSinh.size();++i){
              ThiSinh thiSinh = listThiSinh.get(i);
              System.out.println(thiSinh.ma+ " " + thiSinh.name + " "+ thiSinh.strDiemUuTien + " "+ thiSinh.strTongDiem+" " +thiSinh.trangThai);
        }
    }
}
