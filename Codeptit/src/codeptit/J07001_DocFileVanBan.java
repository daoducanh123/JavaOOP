/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author DAGaming
 */
public class J07001_DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException {
         File f = new File("DATA.in");
         //File f = new File("C:\\Users\\DAGaming\\Documents\\DATA.in");
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
    
}
    