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
public class J02105_DanhSachKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =  sc.nextInt();
        int [][] arr = new int[n+1][n+1];
        ArrayList<Integer>[] list = new ArrayList[n+1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 1; i <= n;++ i){
            for (int j = 1; j<= n; ++j){
                arr[i][j] = sc.nextInt();
                if (arr[i][j]==1){
                    list[i].add(j);
                }
            }
        }
        for (int i = 1; i <= n; ++i){
            System.out.printf("List(%d) = ",i);
            for (int aa: list[i]){
                System.out.print(aa+" ");
            }
            System.out.println("");
        }
        
    }
}
