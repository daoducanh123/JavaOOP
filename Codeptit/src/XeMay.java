
import java.util.Scanner;

public class XeMay extends PhuongTien {

    private int dungTich;
    private String loaiXe;

    public XeMay() {
        super();
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Dung tich (cc): ");
        dungTich = sc.nextInt();
        sc.nextLine();

        System.out.print("Loai xe: ");
        loaiXe = sc.nextLine();
    }

    @Override
    public void hienThi() {
        super.hienThi();

        System.out.printf(
            " | Dung tich: %dcc | Loai xe: %s%n",
            dungTich, loaiXe
        );
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
}