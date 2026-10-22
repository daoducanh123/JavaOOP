/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.io.*;
/**
 *
 * @author DAGaming
 */
public class J07022_LoaiBoSoNguyen {
    public static void main(String[] args) throws Exception{
        File f = new File ("DATA.in");
        Scanner sc = new Scanner (f);
        ArrayList <String> list = new ArrayList<>();
        while (sc.hasNext()){
            String s = sc.next();
            try{
              int number = Integer.parseInt(s);
            }
            catch (NumberFormatException e){
                list.add(s);
            }
        }
        Collections.sort(list);
        for (String lString: list){
            System.out.print(lString +" ");
        }
    }
}
