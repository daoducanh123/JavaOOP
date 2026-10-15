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
public class J07032_SoThuanNghichTrongFile {
    public static void main(String[] args)throws Exception {
        FileInputStream f1 = new FileInputStream("DATA1.in");
        FileInputStream f2 = new FileInputStream("DATA2.in");
        ObjectInputStream objectInputStream1 = new ObjectInputStream (f1);
        ObjectInputStream objectInputStream2 = new ObjectInputStream (f2);

        ArrayList<Integer> arrayList1 = (ArrayList<Integer>) objectInputStream1.readObject();
        ArrayList<Integer> arrayList2 = (ArrayList<Integer>) objectInputStream2.readObject();

        objectInputStream1.close();
        objectInputStream2.close();
        
       
        
        TreeMap <Integer,Integer> treeMap1 = new TreeMap<>();
        TreeMap <Integer,Integer> treeMap2 = new TreeMap<>();

        for (int x: arrayList1){
            if (treeMap1.containsKey(x)){
                treeMap1.put(x, treeMap1.get(x)+1);
            }
            else{
                treeMap1.put(x,1);
            }
        }
        for (int x: arrayList2){
            if (treeMap2.containsKey(x)){
                treeMap2.put(x, treeMap2.get(x)+1);
            }   
            else{
                treeMap2.put(x,1);
            }
        }
        TreeMap <Integer,Integer> treeMap = new TreeMap<>();

        for (int x: treeMap1.keySet()){
            boolean ok = true;
            String s = String.valueOf(x);
    
            // Số chữ số cũng là một số lẻ nhưng lớn hơn 1
            if (s.length() == 1 || s.length() % 2 == 0){
                ok = false;
            }
            
            if (ok){
                // Tất cả các chữ số đều lẻ
                for (int i = 0; i < s.length(); ++i){
                    int num = s.charAt(i)-'0';
                    if (num % 2 == 0){
                        ok = false;
                    }
                }
            }
            
            // Thuan nghich
            if (ok){
                
                int l = 0, r = s.length()-1;
                while (l < r){
                    if (s.charAt(l++)!= s.charAt(r--)){
                        ok = false;
                        break;
                    }
                }
            }
            
            
            // Xuất hiện trong cả hai file DATA1.in và DATA2.in
            if (ok){
                if (treeMap2.containsKey(x)){
                    treeMap.put(x, treeMap1.get(x)+treeMap2.get(x));
                }
            }
            
                   // In tối đa 10 số sau khi lọc xong
        }
        int cnt = 0;
        for (Map.Entry<Integer, Integer> mapEntry : treeMap.entrySet()) {
            if (cnt == 10) {
                break;
            }
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
            cnt++;
        }
    }
}