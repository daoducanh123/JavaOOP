/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.io.*;
/**
 *
 * @author DAGAMING
 */
public class J07021_ChuanHoaXauHotenTrongFile {
    public static void main(String[] args) throws Exception {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()){
            String name = sc.nextLine();
            if (name.equals("END")){
                break;
            }
            name = name.trim().toLowerCase();
            String[] arrName = name.split("\\s+"); 
            for (int i = 0; i < arrName.length; ++i){
                char c = arrName[i].charAt(0);
                c = Character.toUpperCase(c);
                arrName[i] = c + arrName[i].substring(1);
            }
            String resName = String.join(" ", arrName);
            System.out.println(resName);
        }
    }
}
