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
public class J03009_TapTuRiengCua2xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        while (t -->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            
            String[] arrayS1 = s1.split("\\s+");
            String[] arrayS2 = s2.split("\\s+");
            
            //abc ab ab ab abcd
            // ab abc
            TreeSet<String> treeSet1 = new TreeSet<String>();
            TreeSet<String> treeSet2 = new TreeSet<String>();
            
            for (int i = 0; i < arrayS1.length; ++i){
                treeSet1.add(arrayS1[i]);
            }
            for (int i = 0; i < arrayS2.length; ++i){
                treeSet2.add(arrayS2[i]);
            }
            
            HashMap<String,Integer> hMap = new HashMap<>();
            for (String s: treeSet1){
                hMap.put(s, 1);
            }
            for (String s: treeSet2){
                if (hMap.containsKey(s)){
                    hMap.put(s, hMap.get(s)+1);
                }
                else{
                    continue;
                }
            }
            
            // Các từ có trong s1 nhưng không có trong s2
//            for (String s : treeSet1) {
  //              if (!treeSet2.contains(s)) {
    //                System.out.print(s + " ");
      //          }
        //    }

            for (Map.Entry<String,Integer> entry: hMap.entrySet()){
                if (entry.getValue() == 1){
                    System.out.print(entry.getKey()+" ");
                }
            }
            System.out.println("");
        }
        sc.close();
        
    }
}
