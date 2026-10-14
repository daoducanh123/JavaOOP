/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;

/**
 *
 * @author DAGaming
 */
public class J04008_ChuViTamGiac {
    public static class Point{
        private double x,y;
        
        
        public Point(){
            
        }
        
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        
        public Point CopyPoint(Point p){
            Point copyPoint = new Point();
            copyPoint.x = p.x;
            copyPoint.y = p.y;
            return copyPoint;
        }
        
        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }

        public double distance(Point secondPoint){
            double dx = Math.abs(this.x - secondPoint.x);
            double dy = Math.abs(this.y - secondPoint.y);
            
            double res = Math.sqrt(dx*dx +dy*dy);
            return res;
        }
        public double distance (Point p1, Point p2){
            double dx = Math.abs(p1.x - p2.x);
            double dy = Math.abs(p1.y - p2.y);
            
            double res = Math.sqrt(dx*dx +dy*dy);
            return res;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            Point p3 = new Point(x3,y3);
            
            // check 
            double c = p1.distance(p2);
            double b = p1.distance(p3);
            double a = p2.distance(p3);
            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("INVALID");
            } else {
                System.out.printf("%.3f%n", a + b + c);
            }
            
        }
    }
}
