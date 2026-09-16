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


// 5 7 3 2
// Buoc 0 : 5
// Buoc 1 : 5 7
// Buoc 2 : 
    // 5 7 3        i = 2; value = a[2] = 3; j = i - 1
    //   j i        a[j] > value
    // 5 7 7        a[j+1] = a[j]
    
     
    // 5 7 7        
    // j            j--; a[j] > value
    // 5 5 7        a[j+1] = a[j]  

    // 5 5 7
    // j < 0        a[j+1] = value
    // 3 5 7


public class J02012_SapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; ++i){
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = value;
            
            // in
            System.out.print("Buoc " + i + ": ");
            for (int k = 0; k < i+1; ++k){
                System.out.print(arr[k] + " ");
            }System.out.println("");
        }
     
    }
}
