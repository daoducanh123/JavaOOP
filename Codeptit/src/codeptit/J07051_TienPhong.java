package codeptit;

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class J07051_TienPhong {
    public static class ThongTin {
        static int cnt = 0;

        String maString, name, soPhong, ngayNhan, ngayTra;
        int tienDichVu, soNgay, thanhTien;

        public ThongTin(String maString, String name, String soPhong,
                        String ngayNhan, String ngayTra, int tienDichVu) {
            this.maString = maString;
            this.name = name;
            this.soPhong = soPhong;
            this.ngayNhan = ngayNhan;
            this.ngayTra = ngayTra;
            this.tienDichVu = tienDichVu;
        }

        public void ChuanTen() {
            String[] arrName = name.trim().toLowerCase().split("\\s+");

            for (int i = 0; i < arrName.length; i++) {
                arrName[i] = Character.toUpperCase(arrName[i].charAt(0))
                        + arrName[i].substring(1);
            }

            name = String.join(" ", arrName);
        }
        public void ChuanNgay(){
            this.ngayNhan = this.ngayNhan.trim();
            this.ngayTra = this.ngayTra.trim();
            String[] arr1 = this.ngayNhan.split("/");
            String[] arr2 = this.ngayTra.split("/");

            int ngay1 = Integer.parseInt(arr1[0]);
            int thang1 = Integer.parseInt(arr1[1]);
            int nam1 = Integer.parseInt(arr1[2]);
            int ngay2 = Integer.parseInt(arr2[0]);
            int thang2 = Integer.parseInt(arr2[1]);
            int nam2 = Integer.parseInt(arr2[2]);
            this.ngayNhan = String.format("%02d/%02d/%04d", ngay1, thang1, nam1);
            this.ngayTra = String.format("%02d/%02d/%04d", ngay2, thang2, nam2);
        }
        public void TinhTien() {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate nhan = LocalDate.parse(ngayNhan.trim(), fmt);
            LocalDate tra = LocalDate.parse(ngayTra.trim(), fmt);

            soNgay = (int) ChronoUnit.DAYS.between(nhan, tra)+1;


            int gia = 0;
            char tang = soPhong.charAt(0);

            if (tang == '1') gia = 25;
            else if (tang == '2') gia = 34;
            else if (tang == '3') gia = 50;
            else if (tang == '4') gia = 80;

            thanhTien = soNgay * gia + tienDichVu;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));

        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<ThongTin> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = String.format("KH%02d", ++ThongTin.cnt);
            String name = sc.nextLine().trim();
            String phong = sc.nextLine().trim();
            String nhan = sc.nextLine().trim();
            String tra = sc.nextLine().trim();
            int dichVu = Integer.parseInt(sc.nextLine().trim());

            ThongTin x = new ThongTin(ma, name, phong, nhan, tra, dichVu);

            x.ChuanNgay();
            x.ChuanTen();
            x.TinhTien();
            ds.add(x);
        }

        ds.sort((a, b) -> b.thanhTien - a.thanhTien);

        for (ThongTin x : ds) {
            System.out.println(x.maString + " " + x.name + " "
                    + x.soPhong + " " + x.soNgay + " " + x.thanhTien);
        }

        sc.close();
    }
}