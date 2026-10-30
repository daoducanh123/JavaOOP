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
public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while(x<=t){
            System.out.println("Test " + x + ": ");
            int n =sc.nextInt();
            int a[] = new int[n];
            int mark[] = new int[100005];
            for(int i = 0; i <n ; ++i){
                a[i] = sc.nextInt();
                mark[a[i]]++;
            }
            for(int i = 0; i < n; ++i){
                if (mark[a[i]] > 0){
                    System.out.println(a[i]+ " xuat hien "+ mark[a[i]] + " lan");
                    mark[a[i]]= 0;
                }
            }x++;
        }
    }
    
}
