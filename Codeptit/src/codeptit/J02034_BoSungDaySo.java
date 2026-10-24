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
public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[205];
        Arrays.fill(visited, false);
        int maxValue = -1;
        for (int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
            visited[arr[i]] = true;
            maxValue = Integer.max(arr[i], maxValue);
        }
        // 1 2 3 5
    //     0 1 2 3 4 5
        // F T T T F T
        boolean ok = true;
        for (int i = 1; i <= maxValue; ++i){
            if (visited[i] == false){
                System.out.println(i);
                ok = false;
            }
        }
        if(ok){
            System.out.println("Excellent!");
        }
    }
}
