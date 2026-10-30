/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_07_10_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b [] = new int[m];
        int c[] = new int[1005];
        
        for (int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
            c[a[i]] = 1;
        }
        for (int i = 0 ; i< m; ++i){
            b[i] = sc.nextInt();
            c[b[i]] = 1;
        }
        
        Arrays.sort(b);
        
        for (int i = 0; i < 1001; ++i){
            if (c[i] == 1){
            System.out.print(i + " ");
        }
        }
    }
}
