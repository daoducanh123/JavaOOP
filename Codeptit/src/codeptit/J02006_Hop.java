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
public class J02006_Hop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        
        boolean[] visited = new boolean[105];
        
        Arrays.fill(visited, false);

        for (int i = 0; i < n; ++i){
            int x = sc.nextInt();
                a[i] = x;
                visited[x] = true;
        }
        
        for (int i = 0; i < m; ++i){
            int x = sc.nextInt();
                b[i] = x;
                visited[x] = true;
        }
        
        for (int i = 0; i < 104 ; ++i){
            if (visited[i] == true){
                System.out.print(i + " ");
            }
        }
    }
}
