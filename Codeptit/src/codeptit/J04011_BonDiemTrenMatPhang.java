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
public class J04011_BonDiemTrenMatPhang {
    public static class Point3D{
        int x,y,z;
        public Point3D (int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d){
            // Vector AB
            int x1 = b.x - a.x;
            int y1 = b.y - a.y;
            int z1 = b.z - a.z;

            // Vector AC
            int x2 = c.x - a.x;
            int y2 = c.y - a.y;
            int z2 = c.z - a.z;

            // Vector AD
            int x3 = d.x - a.x;
            int y3 = d.y - a.y;
            int z3 = d.z - a.z;
            
            // AB (AC * AD) = 0     vo huong * co huong 
            // co huong AC * AD
            int X = y2*z3-y3*z2;
            int Z = x2*y3-x3*y2;
            int Y = z2*x3-z3*x2;
            // vohuong AB * (X,Y,Z)
            int res = x1 * X + y1 * Y + z1 * Z;
            return res == 0;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            }
            else{

                System.out.println("NO");
            }
        }
    }
}
