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
public class J01025_HinhVUong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Hình chữ nhật 1
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Hình chữ nhật 2
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        
        // HVUONG
        int minX = Math.min(x1, x3);
        int minY = Math.min(y1, y3);
        
        int maxX = Math.max(x2, x4);
        int maxY = Math.max(y2, y4);

        int height = maxY - minY;
        int width = maxX - minX;
        
        int side = Math.max(height,width);
        System.out.println(side*side);
    sc.close();
    }
}
