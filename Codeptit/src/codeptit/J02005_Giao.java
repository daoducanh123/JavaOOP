/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;

/**
 *
 * @author DAGAMING
 */
public class J02005_Giao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        
        boolean[] visitedA = new boolean[1005];
        boolean[] visitedB = new boolean[1005];
        
        Arrays.fill(visitedA, false);
        Arrays.fill(visitedB, false);

        for (int i = 0; i < n; ++i){
            int x = sc.nextInt();
            if (!visitedA[x]){
                a[i] = x;
                visitedA[x] = true;
            }
        }
        
        for (int i = 0; i < m; ++i){
            int x = sc.nextInt();
            if (!visitedB[x]){
                b[i] = x;
                visitedB[x] = true;
            }
        }
        
        for (int i = 0; i < 1005 ; ++i){
            if (visitedA[i] == visitedB[i] && visitedA[i] == true){
                System.out.print(i + " ");
            }
        }
        
    }
}
