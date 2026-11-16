import java.util.*;

public class J06001_TinhHoaDonBanQuanAo {

    // Loại sản phẩm: mã, tên, giá loại 1, giá loại 2
    static class SanPham {
        String ma, ten;
        long gia1, gia2;

        SanPham(String ma, String ten, long gia1, long gia2) {
            this.ma = ma;
            this.ten = ten;
            this.gia1 = gia1;
            this.gia2 = gia2;
        }
    }

    // Mỗi hóa đơn là một đối tượng riêng
    static class HoaDon {
        String ma;
        SanPham sp;
        long giamGia, tienTra;

        HoaDon(String maGoc, int stt, SanPham sp, int soLuong) {
            this.sp = sp;
            this.ma = String.format("%s-%03d", maGoc, stt);

            int loai = maGoc.charAt(2) - '0';
            long don = (loai == 1) ? sp.gia1 : sp.gia2;
            long thanhTien = don * soLuong;

            int phanTram = 0;
            if (soLuong >= 150) phanTram = 50;
            else if (soLuong >= 100) phanTram = 30;
            else if (soLuong >= 50) phanTram = 15;

            this.giamGia = thanhTien * phanTram / 100;
            this.tienTra = thanhTien - giamGia;
        }

        @Override
        public String toString() {
            return ma + " " + sp.ten + " " + giamGia + " " + tienTra;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, SanPham> map = new HashMap<>();
        while (n-- > 0) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            long g1 = Long.parseLong(sc.nextLine().trim());
            long g2 = Long.parseLong(sc.nextLine().trim());
            SanPham sp = new SanPham(ma, ten, g1, g2);
            map.put(ma, sp);
        }

        int m = Integer.parseInt(sc.nextLine().trim());
        for (int i = 1; i <= m; i++) {
            String[] arr = sc.nextLine().trim().split("\\s+");
            String maGoc = arr[0];
            int soLuong = Integer.parseInt(arr[1]);
            SanPham sp = map.get(maGoc.substring(0, 2)); // tra theo mã loại
            HoaDon hd =  new HoaDon(maGoc, i, sp, soLuong);
            System.out.println(hd);
        }
    }
}