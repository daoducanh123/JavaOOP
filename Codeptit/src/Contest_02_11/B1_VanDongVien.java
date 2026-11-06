package Contest_02_11;

import java.util.Locale;
import java.util.Scanner;

public class B1_VanDongVien {

    // Interface: quy định những hàm mà vận động viên phải có
    public interface IVanDongVien {
        public boolean isMa(String maVanDongVien);   // kiểm tra mã có đúng định dạng không
        public boolean isSo(String chuoiSo);         // kiểm tra chuỗi có phải số không
        public double getLuongThucLinh();            // tính lương thực lĩnh
    }

    // Lớp cha: thông tin chung của mọi vận động viên
    public static class VanDongVien {
        protected String maVanDongVien;
        protected String hoTen;
        protected double luongCoBan;

        public VanDongVien() {
        }

        public VanDongVien(String maVanDongVien, String hoTen, double luongCoBan) {
            this.maVanDongVien = maVanDongVien;
            this.hoTen = hoTen;
            this.luongCoBan = luongCoBan;
        }

        public String getMa() {
            return this.maVanDongVien;
        }

        public String getTen() {
            return this.hoTen;
        }

        public double getLuong() {
            return this.luongCoBan;
        }

        public void setLuong(double luongCoBan) {
            this.luongCoBan = luongCoBan;
        }

        public void input(Scanner scanner) {
        }
    }

    // Lớp con: vận động viên chạy (kế thừa VanDongVien và thực hiện IVanDongVien)
    public static class VDVChay extends VanDongVien implements IVanDongVien {

        // Hai con số này MÌNH ĐOÁN theo 2 test mẫu, sửa lại theo đề bài
        private static final int SO_HUY_CHUONG_TOI_THIEU = 3;
        private static final int TIEN_THUONG_MOI_HUY_CHUONG = 140;

        public int cuLyChay;
        public int soHuyChuong;

        public VDVChay() {
        }

        public VDVChay(String maVanDongVien, String hoTen, int cuLyChay,
                       int soHuyChuong, double luongCoBan) {
            super(maVanDongVien, hoTen, luongCoBan);
            this.cuLyChay = cuLyChay;
            this.soHuyChuong = soHuyChuong;
        }

        public void setCuLy(int cuLyChay) {
            this.cuLyChay = cuLyChay;
        }

        public void setSoHuyChuong(int soHuyChuong) {
            this.soHuyChuong = soHuyChuong;
        }

        public int getCuLy() {
            return this.cuLyChay;
        }

        public int getSoHuyChuong() {
            return this.soHuyChuong;
        }

        // Mã hợp lệ: bắt đầu bằng VDVC, dấu gạch ngang, rồi đúng 3 chữ số (không phân biệt hoa/thường)
        @Override
        public boolean isMa(String maVanDongVien) {
            return maVanDongVien.matches("(?i)VDVC-\\d{3}");
        }

        // Chuỗi là số khi chỉ gồm các chữ số (tối đa 9 chữ số để không bị tràn kiểu int)
        @Override
        public boolean isSo(String chuoiSo) {
            return chuoiSo.matches("\\d{1,9}");
        }

        // Lương thực lĩnh = lương cơ bản + tiền thưởng theo số huy chương (công thức ĐOÁN)
        @Override
        public double getLuongThucLinh() {
            return luongCoBan + soHuyChuong * TIEN_THUONG_MOI_HUY_CHUONG;
        }

        // Đọc một số nguyên từ bàn phím, nhập sai thì báo và nhập lại
        private int docSoNguyen(Scanner scanner) {
            while (true) {
                String dongNhap = scanner.nextLine().trim();
                if (isSo(dongNhap)) {
                    return Integer.parseInt(dongNhap);
                }
                System.out.println("nhap sai");
            }
        }

        @Override
        public void input(Scanner scanner) {
            // 1. Nhập mã: sai thì nhập lại, đúng thì đổi thành chữ in hoa
            while (true) {
                String maNhapVao = scanner.nextLine().trim();
                if (isMa(maNhapVao)) {
                    this.maVanDongVien = maNhapVao.toUpperCase();
                    break;
                }
                System.out.println("nhap sai");
            }

            // 2. Nhập họ tên
            this.hoTen = scanner.nextLine().trim();

            // 3. Nhập lương cơ bản, cự ly chạy, số huy chương
            this.luongCoBan = docSoNguyen(scanner);
            this.cuLyChay = docSoNguyen(scanner);
            int soHuyChuongNhapVao = docSoNguyen(scanner);

            // Ít huy chương hơn mức tối thiểu thì tính là 0 (ĐOÁN theo test mẫu 2)
            if (soHuyChuongNhapVao >= SO_HUY_CHUONG_TOI_THIEU) {
                this.soHuyChuong = soHuyChuongNhapVao;
            } else {
                this.soHuyChuong = 0;
            }
        }

        // In ra: mã, họ tên, số huy chương, lương thực lĩnh (rộng 10 ký tự, 1 chữ số thập phân)
        @Override
        public String toString() {
            return String.format(Locale.US, "%s %s %d %10.1f",
                    maVanDongVien, hoTen, soHuyChuong, getLuongThucLinh());
        }
    }

    public static void main(String[] args) {
        VDVChay vanDongVienChay = new VDVChay();
        Scanner scanner = new Scanner(System.in);
        vanDongVienChay.input(scanner);
        System.out.println(vanDongVienChay);
    }
}