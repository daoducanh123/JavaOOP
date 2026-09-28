/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest28_9;
import java.io.*;
import java.util.*;
/**
 *
 * @author DAGaming
 */
public class Bai4 {
    public static class TienDien{
        private String hoten;
        private String loaiHo;
        private long csdau;
        private long cscuoi;
        
        public TienDien(){
            
        }
        public void input(Scanner in){
            this.hoten = in.nextLine();
            this.loaiHo = in.nextLine();
            this.csdau = in.nextLong();
            this.cscuoi = in.nextLong();
            in.nextLine();
            
        } 
        public String chuanHoa(String hoTen){
            this.hoten = this.hoten.trim().toLowerCase();
            this.hoten = this.hoten.split("//s+");
            char[] arr = this.hoten.toLowerCase().toCharArray();
            
            for (int i = 0; i < arr.length(); ++i){
                
            }
            
        }
        
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        TienDien td = new TienDien();
        td.input(in);
        System.out.println(td.toString());
    }
}
