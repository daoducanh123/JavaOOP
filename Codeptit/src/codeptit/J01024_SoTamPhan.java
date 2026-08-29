/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;

/**
 *
 * @author DAGaming
 */
public class J01024_SoTamPhan {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                while(t-->0){
                    boolean ok = true;
                    String n = sc.next();
                    char[] arr = n.toCharArray();
                    for (int i = 0; i  < arr.length; ++i){
                        if (arr[i] != '0' && arr[i] != '1' && arr[i] != '2'){
                            ok = false;
                            break;
                        }
                    }
                    if (ok) System.out.println("YES");
                    else System.out.println("NO");
                }
    }
}
