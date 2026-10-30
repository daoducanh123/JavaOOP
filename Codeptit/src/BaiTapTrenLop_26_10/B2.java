package BaiTapTrenLop_26_10;

import java.util.*;
import java.time.*;
import java.util.stream.*;

class Sach {
    String ten, nxb, ngonNgu;
    double gia;
    LocalDate ngayXB;

    Sach(String ten, String nxb, String nn, double gia, int nam) {
        this.ten = ten;
        this.nxb = nxb;
        ngonNgu = nn;
        this.gia = gia;
        ngayXB = LocalDate.of(nam, 1, 1);
    }

    public String toString() {
        return ten + " | " + nxb + " | " + ngonNgu
                + " | " + gia + " | " + ngayXB.getYear();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Sach> set = new HashSet<>();
        Map<Integer, Sach> map = new HashMap<>();

        System.out.print("Nhap so sach: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap ten, NXB, ngon ngu, gia, nam:");
            String ten = sc.nextLine();
            String nxb = sc.nextLine();
            String nn = sc.nextLine();
            double gia = Double.parseDouble(sc.nextLine());
            int nam = Integer.parseInt(sc.nextLine());

            Sach s = new Sach(ten, nxb, nn, gia, nam);
            set.add(s);
            map.put(i, s);
        }

        // SET: in sach
        System.out.println("\n--- SET ---");
        set.forEach(System.out::println);

        // MAP: in sach
        System.out.println("\n--- MAP ---");
        map.forEach((k, v) -> System.out.println(k + ": " + v));

        // Danh sach sach tu Map
        List<Sach> a = new ArrayList<>(map.values());

        // Thong ke tat ca
        System.out.println("\nSo sach: " + a.stream().count());
        System.out.println("Tong gia: " +
                a.stream().mapToDouble(s -> s.gia).sum());
        System.out.println("Gia trung binh: " +
                a.stream().mapToDouble(s -> s.gia).average().orElse(0));

        a.stream().max(Comparator.comparingDouble(s -> s.gia))
                .ifPresent(s -> System.out.println("Sach gia cao nhat: " + s));
        a.stream().min(Comparator.comparingDouble(s -> s.gia))
                .ifPresent(s -> System.out.println("Sach gia thap nhat: " + s));

        // Dem sach theo nam xuat ban
        System.out.println("\nDem theo nam:");
        a.stream().collect(Collectors.groupingBy(
                s -> s.ngayXB.getYear(), Collectors.counting()))
                .forEach((nam, dem) -> System.out.println(nam + ": " + dem));

        // Tong gia theo ngon ngu
        System.out.println("\nTong gia theo ngon ngu:");
        a.stream().collect(Collectors.groupingBy(
                s -> s.ngonNgu, Collectors.summingDouble(s -> s.gia)))
                .forEach((nn, tong) -> System.out.println(nn + ": " + tong));

        // Gia trung binh theo nha xuat ban
        System.out.println("\nGia trung binh theo NXB:");
        a.stream().collect(Collectors.groupingBy(
                s -> s.nxb, Collectors.averagingDouble(s -> s.gia)))
                .forEach((nxb, tb) -> System.out.println(nxb + ": " + tb));

        // Sach gia cao nhat theo tung nam
        System.out.println("\nSach gia cao nhat theo nam:");
        a.stream().collect(Collectors.groupingBy(
                s -> s.ngayXB.getYear(),
                Collectors.maxBy(Comparator.comparingDouble(s -> s.gia))))
                .forEach((nam, sach) -> System.out.println(nam + ": " + sach));

        // Sach gia thap nhat theo tung NXB
        System.out.println("\nSach gia thap nhat theo NXB:");
        a.stream().collect(Collectors.groupingBy(
                s -> s.nxb,
                Collectors.minBy(Comparator.comparingDouble(s -> s.gia))))
                .forEach((nxb, sach) -> System.out.println(nxb + ": " + sach));

        sc.close();
    }
}
