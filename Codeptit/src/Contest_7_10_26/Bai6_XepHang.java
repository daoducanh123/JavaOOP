/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_7_10_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class Bai6_XepHang {
    static class khach{
        int t, d;

        public khach(int t, int d) {
            this.t= t;
            this.d=d;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        khach[] a = new khach[n];
        for (int i = 0; i< n; ++i){
            int t=  sc.nextInt();
            int d = sc.nextInt();
            a[i] = new khach(t,d);
        }
        Arrays.sort(a,(x,y) -> Integer.compare(x.t,y.t));
        int time = 0;
        for(int i = 0;i  <n; ++i){
            time = Math.max(time, a[i].t) + a[i].d;
        }
        System.out.println(time);
    }
}
