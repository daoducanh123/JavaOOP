package codeptit;
import java.io.*;
import java.util.*;

public class J07054_TinhDiemTrungBinh {
    static ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    public static class SinhVien {
        String msv;
        String name;
        double dtbRound;   // điểm đã làm tròn 2 chữ số (dùng để so sánh xếp hạng)
        double dtbRaw;     // điểm thật chưa làm tròn
        String strDTB;     // chuỗi để in
        int rank;

        public SinhVien(String msv, String name, double dtbRound, double dtbRaw, String strDTB) {
            this.msv = msv;
            this.name = name;
            this.dtbRound = dtbRound;
            this.dtbRaw = dtbRaw;
            this.strDTB = strDTB;
        }

        public void ChuanHoa() {
            String[] arrName = this.name.trim().toLowerCase().split("\\s+");
            for (int i = 0; i < arrName.length; ++i) {
                char c = Character.toUpperCase(arrName[i].charAt(0));
                arrName[i] = c + arrName[i].substring(1);
            }
            this.name = String.join(" ", arrName);
        }

        public static void Ranking() {
            // Điểm giảm dần, bằng điểm thì mã tăng dần
         //   listSinhVien.sort((a, b) -> {
           //     int cmp = Double.compare(b.dtbRound, a.dtbRound);
             //   if (cmp != 0) return cmp;
               // return a.msv.compareTo(b.msv);
            //});
            
            listSinhVien.sort((a,b)->a.msv.compareTo(b.msv));
            listSinhVien.sort((a,b)->Double.compare(b.dtbRound, a.dtbRound));
            for (int i = 0; i < listSinhVien.size(); ++i) {
                if (i > 0 && listSinhVien.get(i).dtbRound == listSinhVien.get(i - 1).dtbRound) {
                    listSinhVien.get(i).rank = listSinhVien.get(i - 1).rank;
                } else {
                    listSinhVien.get(i).rank = i + 1;
                }
            }
        }

        public static void Print() {
            for (SinhVien sv : listSinhVien) {
                System.out.println(sv.msv + " " + sv.name + " " + sv.strDTB + " " + sv.rank);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 1; i <= n; ++i) {
            String msv = String.format("SV%02d", i);
            String name = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine().trim());
            double d2 = Double.parseDouble(sc.nextLine().trim());
            double d3 = Double.parseDouble(sc.nextLine().trim());

            // Người ta muốn xếp hạng thứ tự các sinh viên trong danh sách theo
            // điểm trung bình giảm dần. Biết rằng điểm trung bình tính đến 2 số phần thập phân và nếu điểm bằng nhau thì thứ hạng cũng bằng nhau.
            double dtbRaw = (d1 * 3 + d2 * 3 + d3 * 2) / 8;
            String strDTB = String.format("%.2f", dtbRaw);
            double dtbRound = Double.parseDouble(strDTB);

            SinhVien sv = new SinhVien(msv, name, dtbRound, dtbRaw, strDTB);
            sv.ChuanHoa();
            listSinhVien.add(sv);
        }

        SinhVien.Ranking();
        SinhVien.Print();
    }
}