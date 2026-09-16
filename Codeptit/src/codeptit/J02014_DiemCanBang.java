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
public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            long sum = 0;
            for (int i = 0; i < n; ++i){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            // -7 1 5 2 -4 3 0 // sum = 0
            //    i
            
            int pos = -1;
            long left = arr[0];
            long right = 0;
            for (int i = 1; i <= n-2; ++i){
                right = sum - arr[i] - left;
                if (left == right){
                    pos = i+1;
                    break;
                }
                else{
                    left += arr[i];
                }
            }   
            System.out.println(pos);
        }
    }
}
