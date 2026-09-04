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

// input 4
//       5 3 2 7

// i = 0
    // j j1
    // 5 3 2 7
    // 3 5 2 7
    //   j j1 
    // 3 2 5 7
    //     j j1 odoi 
    //         -> b1 3257 j = n-1-i

// i = 1
    // j j1 
    // 3 2 5  7
    // 2 3 5  7 
    //   j j1 odoi 
    //         -> b2 2357 j = n-1-i

// i = 2
    // 2 3 5 7
    // j j1  odoi 
   //         -> b3 2357 j = n-2


//output
// 3 2 5 7
// 2 3 5 7
public class J02013_SapXepNoiBot {
    public static void in(int arr[], int n) {
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " " );
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n - 1; ++i){
            boolean isSwapped = false;
            for (int j = 0; j < n-1-i; ++j){
                if (arr[j] > arr[j+1]){
                    isSwapped = true;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            System.out.print("Buoc" + " " + (i+1) + ": ");
            in(arr, n);
            if(isSorted(arr,n)) break;
        }
    }
}
