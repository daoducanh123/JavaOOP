/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 *
 * @author DAGaming
 */
public class J07001_DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException { // ko có try catch -> đẩy lên cho jvm xử lý, main ko xử lý 
        File f = new File ("DATA.in");
        Scanner sc = new Scanner(f);
        long sum = 0;
        while (sc.hasNext()){
            String token = sc.next();
            try{
                int number = Integer.parseInt(token);
                sum += number;
            }
            catch (NumberFormatException e){ // Không phải số int → bỏ qua
            }
        }
        System.out.println(sum);
    }
}
    