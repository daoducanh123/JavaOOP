/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_28_10;
import java.util.*;
/**
 *
 * @author DAGaming
 */
public class Bai5_SoPHuc {
    static class sophuc{
        int thuc, ao;
        public sophuc(int thuc,int ao){
            this.thuc = thuc;
            this.ao = ao;
        }
        public sophuc cong(sophuc b){
            return new sophuc(thuc +b.thuc, ao+b.ao);
        }
        public sophuc nhan(sophuc b){
            return new sophuc(thuc * b.thuc - ao * b.ao, thuc * b.ao + ao *b.thuc);
        }
        @Override 
        public String toString(){
            if(ao < 0){
                return thuc + " - " +(-ao) + "i";
            }
            return thuc + " + " + ao + "i";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();

            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
        
            sophuc aa = new sophuc(a,b);
            sophuc bb = new sophuc(c,d);
            sophuc tong = aa.cong(bb);
            sophuc cc=  tong.nhan(aa);
            sophuc dd = tong.nhan(tong);
            System.out.println(cc + ", " + dd);
            
        }
    }
}
