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
public class J02016_Bo3SoPytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            
            for (int i = 0; i < n; ++i){
                arr[i] = sc.nextLong();
                arr[i] *= arr[i];
            }
            Arrays.sort(arr);
            
            
            if (n == 1 || n == 2){
                System.out.println("NO");
                continue;
            }
            // 1 2 3 4 5
             
            // 1 4 9 16 25
            boolean found = false;
            for (int i = n-1; i >= 2 && !found; --i){
                int right = i-1;
                int left = 0;
                while (left < right){
                long sum = arr[left] + arr[right];
                    if (sum == arr[i]){
                        found = true;
                        break;
                    }
                    else if (sum < arr[i]){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
            if (found){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
    }
}
