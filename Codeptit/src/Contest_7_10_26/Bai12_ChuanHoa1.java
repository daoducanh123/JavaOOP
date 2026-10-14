/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_7_10_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class Bai12_ChuanHoa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=  sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String name = sc.nextLine();
            name = name.trim().toLowerCase();
            String[] arrName = name.split("\\s+");
            for (int i = 0; i < arrName.length; ++i){
                char c = arrName[i].charAt(0);
                c = Character.toUpperCase(c);
                arrName[i] = c + arrName[i].substring(1);
            }
            for (int i =0; i< arrName.length;++i){
                System.out.print(arrName[i] + " ");
            }
            System.out.println("");
        }
    }
}
