
import java.util.Scanner;

public class Oto extends PhuongTien {

    private int soCho;
    private String kieuDongCo;

    public Oto() {
        super();
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("So cho: ");
        soCho = sc.nextInt();
        sc.nextLine();

        System.out.print("Kieu dong co: ");
        kieuDongCo = sc.nextLine();
    }

    @Override
    public void hienThi() {
        super.hienThi();

        System.out.printf(
            " | So cho: %d | Dong co: %s%n",
            soCho, kieuDongCo
        );
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
}