/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author DAGAMING
 */
public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException { // là cha của FileNotFoundException
        FileInputStream f = new FileInputStream("DATA.in");
        DataInputStream dis = new DataInputStream(f);
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        
        // Input
        // File DATA.IN có 100000 số nguyên dương.
        for (int i = 0; i < 100000; ++i){
            int x = dis.readInt();
            if (tm.containsKey(x)){
                tm.put(x, tm.get(x)+1);
            }
            else{
                tm.put(x,1);
            }
        }
        dis.close();
        for (Map.Entry<Integer,Integer> entry: tm.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

    }
}
