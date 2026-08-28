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
public class J04002_KhaiBaoLopHCN {
    public static class Rectangle{
        private double width, height;
        private static String color;
        
        public Rectangle(){
            width = 1;
            height = 1;
        }
        public Rectangle(double width, double height, String color){
            this.width = width;
            this.height = height;
            this.color = color;
        }
        
        public double getWidth(){
            return this.width;
        }
        public double getHeight(){
            return this.height;
        }
        
        
        public void setWidth(double width){
            this.width = width;
        }
        public void setHeight(double height){
            this.height = height;
        }
        
        public static String getColor(){
            color = color.substring(0,1).toUpperCase() + color.substring(1,color.length()).toLowerCase();
            return color;
        }
        
        public static void setColor(String c){
            color = c;
        }
        
        public double findArea(){
            return this.width * this.height;
        }
        
        public double findPerimeter(){
            return (this.width + this.height)*2;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String c = sc.next();
        if (a <= 0 || b <= 0){
            System.out.println("INVALID");
            return; 
        }
        Rectangle rec = new Rectangle(a,b,c);
        
        System.out.printf("%.0f %.0f %s\n",rec.findPerimeter(),rec.findArea(),rec.getColor());
        
    }
}
