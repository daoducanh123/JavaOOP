package codeptit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAGaming
 */
import java.io.*;
import java.util.*;
public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws Exception{

        // Cho file nhị phân NHIPHAN.in chứa một ArrayList<String>. Mỗi String trong danh sách có thể có nhiều từ. 
        FileInputStream fis = new FileInputStream("NHIPHAN.in");
        ObjectInputStream obj = new ObjectInputStream(fis);
        ArrayList<String> list = (ArrayList<String>)obj.readObject();
        
        LinkedHashSet<String> linkHashSet = new LinkedHashSet<>();
        for (String s: list){
            String [] words = s.trim().toLowerCase().split("\\s+");
            for (String word: words){
                linkHashSet.add(word);
            }
        }
        
        // Cho file văn bản VANBAN.in có tối đa 200 dòng văn bản.
        File f = new File ("VANBAN.in");
        Scanner sc = new Scanner (f);
        LinkedHashSet <String> res = new LinkedHashSet<>();
        while (sc.hasNext()){
            String s = sc.next().toLowerCase();
            if (linkHashSet.contains(s)){
                res.add(s);
            }
        }
        for (String word:res){
            System.out.println(word);
        }
                
        
        
    }
   
}
