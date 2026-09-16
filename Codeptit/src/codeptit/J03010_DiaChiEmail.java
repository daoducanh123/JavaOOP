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
public class J03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String gmailString = "@ptit.edu.vn";
        HashMap<String, Integer> hMap = new HashMap<>();
        
        while (t-->0){
            String name = sc.nextLine();
            name = name.trim();
            name = name.toLowerCase();
            
            // Array
            String[] arrayName = name.split("\\s+");
            int len = arrayName.length;
            
            // put vao hmap
            String lastName = arrayName[len-1];
            if (!hMap.containsKey(lastName)){
                hMap.put(lastName, 1);
            }
            else{
                hMap.put(lastName, hMap.get(lastName)+1);
            }
            
            // nameArray = nguyen|quang|vinh
            
            
            String res = lastName;
            for (int i = 0; i < len-1;++i){
                res = res + arrayName[i].charAt(0);
            }
            if (hMap.get(lastName) > 1){
                res += hMap.get(lastName).toString();
            }
            
            System.out.println(res + gmailString);
        }
    }
}
