/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_16_9_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class Bai5_ChiaTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int t = scanner.nextInt();
        
        while(t-->0){
            int B = 1;
            int N = scanner.nextInt();
            int H = scanner.nextInt();
            double k = (0.5*B*H)/N;
            // b/B = h/H -> b = h/H
            // s = 0.5f * b * h -> s = 0.5f * h * h / H -> h = sqrt(2sH) -> h = sqrt(2kiH)  
            
            for (int i = 1; i< N; ++i){
                double h = Math.sqrt(2*k*i*H);
                System.out.printf("%.6f ",h);
            }
            System.out.println("");
        }
    }
}
