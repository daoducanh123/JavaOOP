/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
/**
 *
 * @author DAGAMING
 */
public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File ("DATA.in");
        Scanner sc = new Scanner(f);
        TreeMap <Integer,Integer> tm = new TreeMap<>();
        while (sc.hasNext()){
            String token = sc.next();
            try{
                int num = Integer.parseInt(token);
                if (tm.containsKey(num)){
                    tm.put(num,tm.get(num)+1);
                }
                else{
                    tm.put(num,1);
                }
            }
            catch(NumberFormatException e){
                // skip
            }
        }
        for (Map.Entry<Integer,Integer> x: tm.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        
    }
}
