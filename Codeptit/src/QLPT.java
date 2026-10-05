import java.util.*;

public class QLPT implements IChucNang {

    private final PhuongTien[] ds;
    private int n;

    public QLPT() {
        ds = new PhuongTien[100];
        n = 0;
    }

    @Override
    public void nhap(Scanner sc) {

        System.out.print("Nhap so luong phuong tien: ");
        int m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < m; i++) {

            System.out.println("\n1. Oto");
            System.out.println("2. Xe may");

            System.out.print("Chon loai: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                Oto oto = new Oto();
                oto.nhap(sc);

                ds[n++] = oto;

            } else if (choice == 2) {

                XeMay xeMay = new XeMay();
                xeMay.nhap(sc);

                ds[n++] = xeMay;
            }
        }
    }

    @Override
    public void hienThi() {

        if (n == 0) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (int i = 0; i < n; i++) {
            ds[i].hienThi();
        }
    }

    @Override
    public void them() {

        System.out.println("\n1. Oto");
        System.out.println("2. Xe may");

        Scanner sc = new Scanner(System.in);

        System.out.print("Chon loai: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            Oto oto = new Oto();
            oto.nhap(sc);
            ds[n++] = oto;

        } else if (choice == 2) {

            XeMay xeMay = new XeMay();
            xeMay.nhap(sc);
            ds[n++] = xeMay;
        }
    }

    @Override
    public void sapxep() {
        
        Arrays.sort(ds,(a,b) ->Double.compare (a.getGia(),b.getGia()));
        System.out.println("Da sap xep theo gia tang dan!");
    }

    @Override
    public void timTheoTen() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten can tim: ");
        String ten = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (ds[i].getTenPT().equalsIgnoreCase(ten)) {
                ds[i].hienThi();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay!");
        }
    }
}