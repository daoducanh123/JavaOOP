package codeptit;

import java.util.*;
import java.io.*;

public class J07052_DanhSachTrungTuyen {

    public static class ThiSinh {
        static double diemChuan = 0;

        String msv;
        String name;
        double diem;
        double uuTien;
        String trangThai;

        public ThiSinh(String msv, String name, double diem, double uuTien) {
            this.msv = msv;
            this.name = name;
            this.diem = diem;
            this.uuTien = uuTien;
        }

        public void ChuanTen() {
            this.name = name.trim().toLowerCase();
            String[] arr = this.name.split("\\s+");

            for (int i = 0; i < arr.length; ++i) {
                char c = Character.toUpperCase(arr[i].charAt(0));
                arr[i] = c + arr[i].substring(1);
            }

            this.name = String.join(" ", arr);
        }

        public void TrangThai() {
            if (this.diem >= diemChuan) {
                this.trangThai = "TRUNG TUYEN";
            } else {
                this.trangThai = "TRUOT";
            }
        }
    }

    // SỬA: số nguyên in không có .0, số thập phân giữ nguyên
    static String fmt(double x) {
        if (x == (int) x) {
            return String.valueOf((int) x);
        }
        return String.valueOf(x);
    }

    public static void main(String[] args) throws Exception {
        ArrayList<ThiSinh> listThiSinh = new ArrayList<>();

        File f = new File("THISINH.in");
        Scanner sc = new Scanner(f);

        int n = Integer.parseInt(sc.nextLine().trim());

        while (n-- > 0) {
            String msv = sc.nextLine().trim();
            String name = sc.nextLine();

            double[] arr = new double[3];
            double sum = 0;

            for (int i = 0; i < 3; ++i) {
                arr[i] = Double.parseDouble(sc.nextLine().trim());

                if (i == 0) {
                    arr[i] *= 2; // Toán nhân đôi
                }

                sum += arr[i];
            }

            // Tính điểm ưu tiên theo ký tự thứ 3 của mã thí sinh
            String khuVuc = msv.substring(2, 3);
            double uuTien = 0;

            switch (khuVuc) {
                case "1":
                    uuTien = 0.5;
                    break;
                case "2":
                    uuTien = 1.0;
                    break;
                case "3":
                    uuTien = 2.5;
                    break;
            }

            sum += uuTien;

            ThiSinh thiSinh = new ThiSinh(msv, name, sum, uuTien);
            thiSinh.ChuanTen();
            listThiSinh.add(thiSinh);
        }

        // SỬA: chỉ tiêu nằm ở dòng cuối file, đọc sau vòng lặp
        int chiTieu = Integer.parseInt(sc.nextLine().trim());
        sc.close();

        // GIỮ NGUYÊN cách sort 2 lần của bạn
        listThiSinh.sort((a, b) -> a.msv.compareTo(b.msv));
        listThiSinh.sort((a, b) -> Double.compare(b.diem, a.diem));

        // SỬA: phải tìm điểm chuẩn sau khi đã sort
        ThiSinh.diemChuan = listThiSinh.get(chiTieu - 1).diem;

        // Điểm chuẩn in 1 chữ số thập phân
        System.out.printf("%.1f%n", ThiSinh.diemChuan);

        for (ThiSinh ts : listThiSinh) {
            ts.TrangThai();

            System.out.printf("%s %s %s %s %s%n",
                    ts.msv,
                    ts.name,
                    fmt(ts.uuTien),
                    fmt(ts.diem),
                    ts.trangThai);
        }
    }
}
