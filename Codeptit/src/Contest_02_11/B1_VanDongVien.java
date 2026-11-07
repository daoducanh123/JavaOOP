package Contest_02_11;

import java.util.Scanner;

public class B1_VanDongVien {

    // ===== ĐỀ CHO SẴN (không cần viết) =====
    public interface IVanDongVien {
        public boolean isMa(String ma);
        public boolean isSo(String so);
        public double getLuongThucLinh();
    }

    public static class VanDongVien {
        protected String ma, ten;
        protected double luong;

        public VanDongVien() {}
        public VanDongVien(String ma, String ten, double luong) {
            this.ma = ma; this.ten = ten; this.luong = luong;
        }
        public String getMa() { return ma; }
        public String getTen() { return ten; }
        public double getLuong() { return luong; }
        public void setLuong(double luong) { this.luong = luong; }
        public void input(Scanner in) {}
    }

    // ===== PHẦN BẠN CẦN VIẾT =====
    public static class VDVChay extends VanDongVien implements IVanDongVien {
        private int cuLy;
        private int soHuyChuong;

        public VDVChay() {}

        public VDVChay(String ma, String ten, int cuLy, int soHuyChuong, double luong) {
            super(ma, ten, luong);
            this.cuLy = cuLy;
            this.soHuyChuong = soHuyChuong;
        }

        public void setCuLy(int cuLy) { this.cuLy = cuLy; }
        public void setSoHuyChuong(int s) { this.soHuyChuong = s; }
        public int getCuLy() { return cuLy; }
        public int getSoHuyChuong() { return soHuyChuong; }

        @Override
        public boolean isMa(String ma) {
            return ma.toUpperCase().matches("VDVC-\\d{3}"); // TODO: theo đề
        }

        @Override
        public boolean isSo(String so) {
            return so.matches("\\d+"); // TODO: theo đề
        }

        @Override
        public double getLuongThucLinh() {
            return luong + soHuyChuong * 140; // TODO: công thức theo đề
        }

        @Override
        public void input(Scanner in) {
            String s;
            // mã
            while (true) {
                s = in.nextLine().trim();
                if (isMa(s)) { ma = s.toUpperCase(); break; }
                System.out.println("nhap sai");
            }
            // tên
            ten = in.nextLine().trim();
            // cự ly
            while (true) {
                s = in.nextLine().trim();
                if (isSo(s)) { cuLy = Integer.parseInt(s); break; }
                System.out.println("nhap sai");
            }
            luong = cuLy; // TODO: lương cơ bản theo đề
            // số huy chương
            while (true) {
                s = in.nextLine().trim();
                if (isSo(s)) { soHuyChuong = Integer.parseInt(s); break; }
                System.out.println("nhap sai");
            }
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + soHuyChuong + "      " + getLuongThucLinh();
        }
    }

    public static void main(String[] args) {
        VDVChay a = new VDVChay();
        Scanner in = new Scanner(System.in);
        a.input(in);
        System.out.println(a);
    }
}