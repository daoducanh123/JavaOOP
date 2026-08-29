/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Scanner;
/**
 *
 * @author DAGAMING
 */
public class J02004_MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i){
                int x = sc.nextInt();
                arr[i] = x;
            }
            
            int l = 0;
            int r = n-1;
            boolean ok = true;
            
            while (l<r){
                if (arr[l] != arr[r]){
                    ok = false;
                    break;
                }
                else{
                    l++; r--;
                }
            }
            if (ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
