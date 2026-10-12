/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.io.*;
import java.util.*;
/**
 *
 * @author DAGaming
 */
public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws Exception {
        File f = new File("VANBAN.in");
        Scanner sc = new Scanner (f);
        TreeSet<String> treeSet = new TreeSet<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String[] arrStrings = s.trim().toLowerCase().split("\\s+");
            for (int i = 0; i < arrStrings.length; ++i){
                treeSet.add(arrStrings[i]);
            }
        }
        for (String tset:treeSet){
            System.out.println(tset);
        }
    }
}
