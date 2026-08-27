/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.ContestMenu_24_8_26;
import java.util.Scanner;
/**
 *
 * @author DAGaming
 */
public class Bai2_Product {
    public static class Product{
        private String id; // P
        private String name;
        private double price;
        private int stock;
        private int cid; // 00
        private static int sid = 1; // 001 increase

        public Product(){
        }
        
        public Product(String id, String name, double price, int stock, int cid) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.stock = stock;
            this.cid = cid;
        }
        
        public void input(Scanner in){
            name = in.nextLine();
            price = in.nextDouble();
            stock = in.nextInt();
            cid = in.nextInt();
            
            // format
            this.id = String.format("P%02d%03d", cid, sid++);
        }
        
        public void out (){
            if (getTotalMoney() == 0){
            System.out.println(id + " " + name + " " + price + " "+ "out of stock");
            }
            else
            System.out.println(id + " " + name + " " + price + " "+ getTotalMoney() );
        }
        
        public long getTotalMoney(){
            return (long)price * stock;
        } 

        
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Product p = new Product();
        p.input(in);
        p.out();
        
        in.close();
    }
}
