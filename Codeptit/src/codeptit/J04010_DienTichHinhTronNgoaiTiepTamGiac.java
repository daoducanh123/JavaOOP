/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.math.*;

/**
 *
 * @author DAGaming
 */
public class J04010_DienTichHinhTronNgoaiTiepTamGiac {
    public static class Point{
        double x,y;
        
        public Point(){
            
        }
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public Point (Point p){
            this.x = p.x;
            this.y = p.y;
        }
        
        public double distance (Point secondPoint){
            double dx =  this.x - secondPoint.x;
            double dy = this.y - secondPoint.y;
            return Math.sqrt(dx*dx + dy*dy);
        }
        
        static double distance (Point p1, Point p2){
            return p1.distance(p2);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            double e = sc.nextDouble();
            double f = sc.nextDouble();
            Point p1 = new Point(a,b);
            Point p2 = new Point(c,d);
            Point p3 = new Point(e,f);
            
            double c1 = Point.distance (p2,p3);
            double c2 = Point.distance (p1,p3);
            double c3 = Point.distance (p1,p2);
            
            if (c1 + c2 <= c3 || c2 + c3 <= c1 || c1 +c3 <= c2){
                System.out.println("INVALID");
                continue;
            }
            double S = 0.25 * Math.sqrt((c1+c2+c3)*(c1+c2-c3)*(c2+c3-c1)*(c3+c1-c2));
            double R = c1*c2*c3 / (4*S);
            System.out.printf("%.3f\n", Math.PI*R*R);
            
        }
    }
}
