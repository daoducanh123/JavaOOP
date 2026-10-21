
package codeptit;

import java.util.*;

public class J04015_TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ma = sc.nextLine();
        String name = sc.nextLine();
        long luong = sc.nextLong();

        String chucVu = ma.substring(0, 2);
        int heso = Integer.parseInt(ma.substring(2, 4));

        long phucap;

        if (chucVu.equals("HT")) {
            phucap = 2000000;
        } else if (chucVu.equals("HP")) {
            phucap = 900000;
        } else {
            phucap = 500000;
        }

        long thunhap = luong * heso + phucap;

        System.out.println(ma + " " + name + " " + heso + " "
                + phucap + " " + thunhap);

        sc.close();
    }
}
