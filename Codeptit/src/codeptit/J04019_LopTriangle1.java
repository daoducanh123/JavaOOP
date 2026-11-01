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
public class J04019_LopTriangle1 {
    public static class Point{
        double x,y;
        
        public Point(double x, double y){
            this.x=x;
            this.y=y;
        }
        public static Point nextPoint(Scanner sc){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            return new Point(x,y);
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
    public static class Triangle{
        Point a,b,c;
        double c1,c2,c3;
        double cvi;
        public  Triangle(Point a, Point b, Point c){
            this.a =  a;
            this.b = b;
            this.c = c;
        }
        public boolean valid(){
            this.c1 = Point.distance(b, c);
            this.c2 = Point.distance(a, c);
            this.c3 = Point.distance(a, b);
            if (c1 + c2 <= c3 || c2 + c3 <= c1 || c1 +c3 <= c2){
                return false;
            }return true;
        }
        public String getPerimeter() {
           this.cvi = c1 + c2 + c3;
           return String.format("%.3f", this.cvi);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
