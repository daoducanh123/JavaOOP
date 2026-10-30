/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_07_10_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            boolean check = true;
            for(int i = 0; i < n; ++i){
                a[i] = sc.nextInt();
                
            }
            for (int i = 0; i < n / 2; ++i){
                int j = n-1-i;
                if(a[i] != a[j]){
                    check = false;
                    break;
                }
            j--;
            }
            if(check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
