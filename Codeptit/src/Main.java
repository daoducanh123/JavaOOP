
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QLPT ql = new QLPT();

        while (true) {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Them phuong tien");
            System.out.println("4. Sap xep theo gia");
            System.out.println("5. Tim theo ten");
            System.out.println("0. Thoat");
            System.out.println("==========================");

            System.out.print("Chon: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    ql.nhap(sc);
                    break;

                case 2:
                    ql.hienThi();
                    break;

                case 3:
                    ql.them();
                    break;

                case 4:
                    ql.sapxep();
                    break;

                case 5:
                    ql.timTheoTen();
                    break;

                case 0:
                    System.out.println("Ket thuc!");
                    return;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}