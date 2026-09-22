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
public class J02020_LietKeToHop2 {
    static int n, k;
    static int[] arr = new int[1000];
    static boolean[] visited = new boolean[1000];
    static int cnt = 0;

    static void Try(int pos){
        for (int value = arr[pos-1] + 1; value <= n-k+pos; ++value){
            if (visited[value] == false){
                visited[value] = true;
                arr[pos] = value;
                
                if (pos == k){
                    cnt += 1;
                    for (int i = 1; i <= k; ++i){
                        System.out.print(arr[i]);
                    }
                    System.out.print(" ");
                }
                else{
                    Try(pos+1);
                }
                visited[value] = false;
                
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr[0] = 0;
        Try (1);
        System.out.println("");
        System.out.println("Tong cong co" + " " + cnt + " to hop");
    }
  
}
