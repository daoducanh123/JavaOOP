package codeptit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAGaming
 */
import java.util.*;
public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        int maxN = 100005;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] mark = new int[maxN];
            Arrays.fill(mark,0);
            
            for (int i = 0; i < n; ++i){
                int x = sc.nextInt();
                arr[i] = x;
                mark[x] ++;
            }
            
            // arr  1 7 2 8 3 3 2 1 3 2
                    
                    // 0 1 2 3 4 5 6 7 8 9 10
            // mark    0 2 3 3 0 0 0 1 1 0 0
            
            System.out.println("Test" + " " + test + ":");
            for (int i = 0; i < arr.length; ++i){
                if (mark[arr[i]] != 0){
                    System.out.println(arr[i] + " xuat hien " + mark[arr[i]] + " lan");
                    mark[arr[i]] = 0;
                }
            }
            
            test++;
        }
    }
}
