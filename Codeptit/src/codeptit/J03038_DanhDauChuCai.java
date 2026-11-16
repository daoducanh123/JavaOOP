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
public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        HashSet<Character> se = new HashSet<>();
        for (int i = 0; i < name.length();++i){
            se.add(name.charAt(i));
        }
        System.out.println(se.size()    );
        
    }
}
