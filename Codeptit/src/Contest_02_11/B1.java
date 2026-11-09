/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_02_11;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class B1 {
    public interface IVanDongVien{
        public boolean isMa(String maVanDongVien);
        public boolean isSo(String chuoiSo);
        public double getLuongThucLinh();
    }
    
    public static class VanDongVien{
        // public cx duoc chả sao
        protected String maVanDongVien , hoTen;
        protected double luongCoBan;
        
        protected VanDongVien(){
            
        }
        protected VanDongVien(String maVanDongVien, String hoTen , double luongCoBan){
            this.maVanDongVien = maVanDongVien;
            this.hoTen = hoTen;
            this.luongCoBan = luongCoBan;
        }
        protected void input(Scanner sc){
            
        }
        public String getMa() {
            return this.maVanDongVien;
        }

        public String getTen() {
            return this.hoTen;
        }

        public double getLuong() {
            return this.luongCoBan;
        }

        public void setLuong(double luongCoBan) {
            this.luongCoBan = luongCoBan;
        }
    }
    public static class VDVChay extends VanDongVien implements IVanDongVien{
            int cuLyChay, soHuyChuong;
            
            public VDVChay() {
            }
            public VDVChay(String maVanDongVien, String hoTen, int cuLyChay,
                       int soHuyChuong, double luongCoBan){
                super(maVanDongVien, hoTen, luongCoBan);
                this.cuLyChay = cuLyChay;
                this.soHuyChuong =soHuyChuong;
            }
            
            public void setCuLy(int cuLyChay) {
                 this.cuLyChay = cuLyChay;
            }

            public void setSoHuyChuong(int soHuyChuong) {
                this.soHuyChuong = soHuyChuong;
            }

            public int getCuLy() {
                return this.cuLyChay;
            }

            public int getSoHuyChuong() {
                return this.soHuyChuong;
            }
            
            @Override // Mã hợp lệ: bắt đầu bằng VDVC, dấu gạch ngang, rồi đúng 3 chữ số (không phân biệt hoa/thường) ví dụ vdvc-126
            
            public boolean isMa(String maVanDongVien) {
                if (maVanDongVien == null || maVanDongVien.length() != 8) {
                    return false;
                }

                if (!maVanDongVien.substring(0, 4).equalsIgnoreCase("VDVC")) {
                    return false;
                }

                if (maVanDongVien.charAt(4) != '-') {
                    return false;
                }

                for (int i = 5; i < 8; i++) {
                    if (!Character.isDigit(maVanDongVien.charAt(i))) {
                        return false;
                    }
                }

                return true;
            }
            
            @Override // Chuỗi là số khi chỉ gồm các chữ số (tối đa 9 chữ số để không bị tràn kiểu int)
            public boolean isSo(String chuoiSo) {
                if (chuoiSo == null || chuoiSo.length() > 9 || chuoiSo.length() < 1) return false;
                for (int i = 0; i < chuoiSo.length();++i){
                    if (chuoiSo.charAt(i) < '0' || chuoiSo.charAt(i) > '9') return false;
                }
                return true;
            }
            
            @Override 
            public double getLuongThucLinh(){
                if (soHuyChuong >= 3)
                return luongCoBan + soHuyChuong * 140;
                
                else return luongCoBan;
            }
            
            @Override 
            public String toString(){
                return String.format("%s %s %d %.1f", maVanDongVien,hoTen,soHuyChuong,getLuongThucLinh());
            }
            
            public int docSoNguyen(Scanner scanner){
                while (true){
                    String so = scanner.nextLine().trim();
                    if (!isSo(so)){
                        System.out.println("Nhap Lai!");
                    }
                    else return Integer.parseInt(so);
                }

            }
            
            public void input (Scanner scanner){
                //ma
                while (true){
                    String maVanDongVien = scanner.nextLine();
                    if (!isMa(maVanDongVien)){
                        System.out.println("Nhap Lai!");
                    }
                    else {
                        this.maVanDongVien = maVanDongVien.toUpperCase();
                        break;
                    }
                }
                // hoten
                String hoTen = scanner.nextLine();
                this.hoTen = hoTen.trim();
                
                //so
                this.luongCoBan = docSoNguyen(scanner);
                this.cuLyChay = docSoNguyen(scanner);
                this.soHuyChuong = docSoNguyen(scanner);
            }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VDVChay vanDongVienChay = new VDVChay();
        vanDongVienChay.input(scanner);
        System.out.println(vanDongVienChay);
    }
}
