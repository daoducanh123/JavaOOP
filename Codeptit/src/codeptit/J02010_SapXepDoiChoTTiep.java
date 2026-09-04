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
public class J02010_SapXepDoiChoTTiep {
    
 
    
    // INPUT
    // 4
    // 5 7 3 2
    
    // i   j
    // 5 7 3 2
 // -> 3 7 5 2
    // i     j
 // -> 2 7 5 3 B1: j = n-1
    
    //   i j
    // 2 7 5 3
 // -> 2 5 7 3
    //   i   j
 // -> 2 3 7 5 B2: j = n-1
    
    //     i j
    // 2 3 7 5
  //-> 2 3 5 7 B3: j = n-1
    
//Buoc 1: 2 7 5 3
//Buoc 2: 2 3 7 5
//Buoc 3: 2 3 5 7
    public static void Print(int arr[], int n){
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    static boolean isSorted(int[] a, int n){
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n-1; ++i){
            for (int j = i + 1; j < n; ++j){
                if (arr[j]< arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
                System.out.print("Buoc " + (i+1) + ": ");
                Print(arr,n);
                if(isSorted(arr,n)) break;
        }
    }
}
