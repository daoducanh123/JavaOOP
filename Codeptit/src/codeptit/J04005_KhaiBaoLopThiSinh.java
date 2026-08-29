/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;
/**
 *
 * @author DAGaming
 */
public class J04005_KhaiBaoLopThiSinh {
    public static class ThiSinh{
        private String name, dob;
        private float d1,d2,d3;
        
        
        public ThiSinh() {
        }
        public void in(Scanner in){
            name = in.nextLine();
            dob = in.nextLine();
            d1 = in.nextFloat();
            d2 = in.nextFloat();
            d3 = in.nextFloat();
            
        }
        public void  out(){
            float sum = d1+d2+d3;
        System.out.println(name + " " + dob + " " + sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh a = new ThiSinh();
        a.in(sc);
        a.out();
    }
}
