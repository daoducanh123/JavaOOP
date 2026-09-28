/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest28_9;
import java.io.*;
import java.util.*;
/**
 *
 * @author DAGaming
 */
public class Bai3 {
    static boolean CheckNTO(int n){
        if (n < 2) return false;
        else{
            for (int i = 2; i * i <= n; ++i){
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while (t-->0){

            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int [][] arr = new int[n][m];
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j){
                    int x = sc.nextInt();
                    arr[i][j] = x;
                }
            }

            ArrayList <Integer> arrayList = new ArrayList<>();
            
            System.out.println("Test " + test +":");
            test ++;           
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j){
                    if (CheckNTO(arr[i][j]) && arrayList.contains(arr[i][j]) == false){
                        arrayList.add(arr[i][j]);
                        System.out.print(arr[i][j]+ " ");
                            
                    }
                }
            }
            System.out.println("");
        }
    }
}
