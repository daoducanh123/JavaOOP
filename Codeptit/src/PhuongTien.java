
import java.util.Scanner;

public class PhuongTien {
    private static int cnt = 0;

    private String maPT;
    private String tenPT;
    private String hangSX;
    private int namSX;
    private double gia;

    public PhuongTien() {
    }

    public PhuongTien(String tenPT, String hangSX, int namSX, double gia) {
        this.maPT = String.format("PT%03d", ++cnt);
        this.tenPT = tenPT;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.gia = gia;
    }

    public String getMaPT() {
        return maPT;
    }

    public void setMaPT(String maPT) {
        this.maPT = maPT;
    }

    public String getTenPT() {
        return tenPT;
    }

    public void setTenPT(String tenPT) {
        this.tenPT = tenPT;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void nhap(Scanner sc) {
        System.out.print("Ten phuong tien: ");
        tenPT = sc.nextLine();

        System.out.print("Hang san xuat: ");
        hangSX = sc.nextLine();

        System.out.print("Nam san xuat: ");
        namSX = sc.nextInt();

        System.out.print("Gia: ");
        gia = sc.nextDouble();
        sc.nextLine();
    }

    public void hienThi() {
        System.out.printf(
            "%s | %s | %s | %d | %.2f",
            maPT, tenPT, hangSX, namSX, gia
        );
    }
}