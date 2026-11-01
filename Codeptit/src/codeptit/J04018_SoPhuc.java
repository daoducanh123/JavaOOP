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
public class J04018_SoPhuc {
    public static class Sophuc{
        int thuc, ao;

        public Sophuc(int thuc, int ao) {
            this.thuc = thuc;
            this.ao = ao;
        }
        public Sophuc(){
            
        }
        
        public Sophuc sum(Sophuc other){
            Sophuc sophuc_sum = new Sophuc();
            sophuc_sum.thuc = this.thuc + other.thuc;
            sophuc_sum.ao = this.ao + other.ao;
            return sophuc_sum;
        }
        public Sophuc mul(Sophuc other){
            Sophuc sophuc_mul = new Sophuc();
            sophuc_mul.ao = this.thuc * other.ao+ this.ao *other.thuc;
            sophuc_mul.thuc = this.thuc * other.thuc - this.ao *other.ao;
            return sophuc_mul;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-->0){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            Sophuc sophuc1 = new Sophuc(a,b);
            Sophuc sophuc2 = new Sophuc(c,d);
            Sophuc sophuc_sum = sophuc1.sum(sophuc2);
            Sophuc sophucC = sophuc_sum.mul(sophuc1);
            Sophuc sophucD = sophuc_sum.mul(sophuc_sum);
            
            if(sophucC.ao < 0){
                System.out.printf("%d - %di",sophucC.thuc, (sophucC.ao)*-1);
            }
            else{
                System.out.printf("%d + %di",sophucC.thuc, sophucC.ao);
            }
            if(sophucD.ao < 0){
                System.out.printf(", %d - %di", sophucD.thuc, -sophucD.ao);
            }
            else{
                System.out.printf(", %d + %di",sophucD.thuc,sophucD.ao);
            }
            System.out.println("");

        }
    }
}
