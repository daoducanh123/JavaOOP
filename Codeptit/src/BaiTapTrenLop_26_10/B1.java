package BaiTapTrenLop_26_10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAGaming
 */
import java.util.Date;
public class B1 {
    public class Sach {
        private String ma;
        private String ten;
        private String nhaXuatBan;
        private double gia;
        private int soBan;
        private Date ngayXuatBan;

        public Sach(String ma, String ten, String nhaXuatBan,
                    double gia, int soBan, Date ngayXuatBan) {
            this.ma = ma;
            this.ten = ten;
            this.nhaXuatBan = nhaXuatBan;
            this.gia = gia;
            this.soBan = soBan;
            this.ngayXuatBan = ngayXuatBan;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public String getNhaXuatBan() {
            return nhaXuatBan;
        }

        public double getGia() {
            return gia;
        }

        public int getSoBan() {
            return soBan;
        }

        public Date getNgayXuatBan() {
            return ngayXuatBan;
        }

    }
   
}
