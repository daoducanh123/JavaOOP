
package codeptit;

import java.util.*;
import java.text.*;

public class BtaptrenlopQLSV {

    interface ChucNang {
        void them(Scanner in);
        void henthi();
        void xoa(String maString);
        void xoaNhieu(String hotenString);
        void tim(String maString);
        void timNhieu(String ten);
        void timTheoNamSinh(String namSinh);
        void timTheoDiem(double tu, double den);
        void sua(String ma);
    }

    static class QLSV implements ChucNang {
        private List<SinhVien> a = new ArrayList<>();

        @Override
        public void them(Scanner in) {
            SinhVien s = new SinhVien();
            s.nhap(in);
            a.add(s);
        }

        @Override
        public void henthi() {
            for (SinhVien s : a) {
                System.out.println(s);
            }
        }

        @Override
        public void xoa(String maString) {
            a.removeIf(s -> s.maString.equals(maString));
        }

        @Override
        public void xoaNhieu(String hotenString) {
            a.removeIf(s -> s.hotenString.equalsIgnoreCase(hotenString));
        }

        @Override
        public void tim(String maString) {
            for (SinhVien s : a) {
                if (s.maString.equals(maString)) {
                    System.out.println(s);
                    break;
                }
            }
            System.out.println("NOT FOUND");
        }

        @Override
        public void timNhieu(String ten) {
            for (SinhVien s : a) {
                if (s.hotenString.toLowerCase()
                        .contains(ten.toLowerCase())) {
                    System.out.println(s);
                }
            }
        }

        @Override
        public void timTheoNamSinh(String namSinh) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

            for (SinhVien s : a) {
                if (sdf.format(s.ngaySinh).equals(namSinh)) {
                    System.out.println(s);
                }
            }
        }

        @Override
        public void timTheoDiem(double tu, double den) {
            for (SinhVien s : a) {
                if (s.gpa >= tu && s.gpa <= den) {
                    System.out.println(s);
                }
            }
        }

        @Override
        public void sua(String ma) {
            // TODO: Bổ sung chức năng sửa sinh viên
        }
    }

    static class SinhVien {
        private String maString, hotenString;
        private Date ngaySinh;
        private boolean gtinh;
        private double gpa;

        private static int sMa = 1;

        public SinhVien() {
            maString = String.format("%03d", sMa++);
        }

        public void nhap(Scanner in) {
            System.out.print("Ho ten: ");
            hotenString = in.nextLine();

            System.out.print("Ngay sinh (dd/MM/yyyy): ");
            try {
                SimpleDateFormat sdf =
                        new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                ngaySinh = sdf.parse(in.nextLine());
            } catch (ParseException e) {
                throw new IllegalArgumentException(
                        "Ngay sinh khong hop le!");
            }

            System.out.print("Gioi tinh (Nam/Nu): ");
            gtinh = in.nextLine().equalsIgnoreCase("Nam");

            System.out.print("GPA: ");
            gpa = Double.parseDouble(in.nextLine());
        }

        public SinhVien(String hotenString, Date ngaySinh,
                        boolean gtinh, double gpa) {
            this();
            this.hotenString = hotenString;
            this.ngaySinh = ngaySinh;
            this.gtinh = gtinh;
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            SimpleDateFormat sdf =
                    new SimpleDateFormat("dd/MM/yyyy");

            return maString + " " + hotenString + " "
                    + sdf.format(ngaySinh) + " "
                    + (gtinh ? "Nam" : "Nu") + " " + gpa;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QLSV q = new QLSV();

        while (true) {
            System.out.println(
                    "1. Nhap\n2. Hien thi\n3. Tim theo ma\n"
                    + "4. Tim theo ten\n5. Xoa (ma)\n"
                    + "6. Xoa (ten)\n7. Sua\n"
                    + "8. Tim theo nam sinh\n9. Tim theo diem\n"
                    + "0. Thoat");

            System.out.print("Chon (0-9): ");
            int chon = Integer.parseInt(in.nextLine());

            switch (chon) {
                case 1 -> q.them(in);
                case 2 -> q.henthi();
                case 3 -> {
                    System.out.print("Nhap ma: ");
                    q.tim(in.nextLine());
                }
                case 4 -> {
                    System.out.print("Nhap ten: ");
                    q.timNhieu(in.nextLine());
                }
                case 5 -> {
                    System.out.print("Nhap ma can xoa: ");
                    q.xoa(in.nextLine());
                }
                case 6 -> {
                    System.out.print("Nhap ten can xoa: ");
                    q.xoaNhieu(in.nextLine());
                }
                case 7 -> {
                    System.out.print("Nhap ma can sua: ");
                    q.sua(in.nextLine());
                }
                case 8 -> {
                    System.out.print("Nhap nam sinh: ");
                    q.timTheoNamSinh(in.nextLine());
                }
                case 9 -> {
                    System.out.print("Nhap diem tu va den: ");
                    double tu = Double.parseDouble(in.nextLine());
                    double den = Double.parseDouble(in.nextLine());
                    q.timTheoDiem(tu, den);
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Chon tu 0 den 9!");
            }
        }
    }
}
