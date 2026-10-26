/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap26_10;
import java.util.*;
import java.time.*;
import java.time.format.*;
/**
 *
 * @author DAGaming
 */
public class B2Thi {
    public static class QLPT{
        ArrayList <PTGT> a = new ArrayList<>();
        
        public QLPT(){
            
        }
        
        public void  nhap (Scanner in){
            // DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            
            String hang = in.nextLine();
            String ma = String.format(hang.substring(0,1).toUpperCase()+"%03d", PTGT.sMa++);
            String strNgayLanBanh = in.nextLine();

            // LocalDate ngayLanBanh = LocalDate.parse(strNgayLanBanh.trim(), fmt);
            String strNamLanBanh = strNgayLanBanh.substring(6);
            int namLanBanh = Integer.parseInt(strNamLanBanh);

            double giaBan = Double.parseDouble(in.nextLine());
            PTGT ptgt = new PTGT(ma, hang, namLanBanh, giaBan);
            a.add(ptgt);
            
        }
        public void tongTienTheoNam(){
            LinkedHashMap<Integer, Double> mp = new LinkedHashMap<>();
            for (int i = 0; i< a.size();++i){
                PTGT ptgt = a.get(i);
                int nam = ptgt.namLanBanh;
                double gia = ptgt.giaBan;
                if (mp.containsKey(nam)){
                    mp.put(nam, mp.get(nam)+gia);
                }
                else{
                    mp.put(nam,0.0);
                }
            }
            for (Map.Entry<Integer,Double> entry : mp.entrySet()){
                System.out.println(entry.getKey() +":"+entry.getValue());
            }
        }
    }
    public static class PTGT{
        static int sMa = 1;
        String ma ;
        String hang ;
        String strNgayLanBanh;
        String strNamLanBanh; //
        int namLanBanh;
        double giaBan;
        
        public PTGT (String ma, String hang, int namLanBanh, double giaBan){
            this.ma = ma ;
            this.hang = hang ;
            this.namLanBanh =namLanBanh;
            this.giaBan = giaBan;
        }
        public double getGiaBan(){
            return giaBan;
        }
        public int getNamLanBanh(){
            String strNamLanBanh = strNgayLanBanh.substring(6);
            this.strNamLanBanh = strNamLanBanh;
            this.namLanBanh = Integer.parseInt(strNamLanBanh);
            return Integer.parseInt(strNamLanBanh);
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QLPT q = new QLPT();
        for (int i = 0; i < 4; ++i){
            q.nhap(in);
        }
        q.tongTienTheoNam();
    }
}
