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
public class J04001_KhaiBaoLopPoint {
    public static class Point{
        private double x;
        private double y;
    
    public Point(){
            
    }
        
    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Point (Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    public double distance (Point secondPoint){
        return Math.sqrt((this.x-secondPoint.x) * (this.x-secondPoint.x) + (this.y-secondPoint.y) *(this.y-secondPoint.y));
    }
    
    public static double distance (Point p1, Point p2){
        double distance_x = p1.x-p2.x;
        double distance_y = p1.y-p2.y;
        double res = Math.sqrt((distance_x * distance_x) + (distance_y * distance_y));
        return res;
    }
    
    
    @Override
    public String toString(){
        return String.format("%.4f %.4f", x,y);
    }
    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            double xA = sc.nextDouble();
            double yA = sc.nextDouble();
            double xB = sc.nextDouble();
            double yB = sc.nextDouble();
            
            Point a = new Point(xA,yA);
            Point b = new Point(xB,yB);
           
            System.out.printf("%.4f%n", Point.distance(a, b));
            
        }
        sc.close();
    }
}
