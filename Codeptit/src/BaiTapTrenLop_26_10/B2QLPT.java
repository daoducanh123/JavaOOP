
package BaiTapTrenLop_26_10;

import java.util.*;

public class B2QLPT {

    public static class QLPT {
        ArrayList<PTGT> a = new ArrayList<>();

        public void nhap(Scanner in) {
            String hang = in.nextLine();
            String ma = String.format(
                hang.substring(0, 1).toUpperCase() + "%03d",
                PTGT.sMa++
            );

            String strNgayLanBanh = in.nextLine();
            int namLanBanh = Integer.parseInt(
                strNgayLanBanh.substring(6)
            );

            double giaBan = Double.parseDouble(in.nextLine());

            PTGT ptgt = new PTGT(ma, hang, namLanBanh, giaBan);
            a.add(ptgt);
        }

        public void tongTienTheoNam() {
            TreeMap<Integer, Double> mp = new TreeMap<>();

            for (int i = 0; i < a.size(); ++i) {
                PTGT ptgt = a.get(i);

                int nam = ptgt.namLanBanh;
                double gia = ptgt.giaBan;

                if (mp.containsKey(nam)) {
                    mp.put(nam, mp.get(nam) + gia);
                } else {
                    mp.put(nam, gia);
                }
            }

            for (Map.Entry<Integer, Double> entry : mp.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }

    public static class PTGT {
        static int sMa = 1;

        String ma;
        String hang;
        int namLanBanh;
        double giaBan;

        public PTGT(String ma, String hang, int namLanBanh, double giaBan) {
            this.ma = ma;
            this.hang = hang;
            this.namLanBanh = namLanBanh;
            this.giaBan = giaBan;
        }

        public double getGiaBan() {
            return giaBan;
        }

        public int getNamLanBanh() {
            return namLanBanh;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        QLPT q = new QLPT();

        for (int i = 0; i < 4; ++i) {
            q.nhap(in);
        }

        q.tongTienTheoNam();
        in.close();
    }
}
