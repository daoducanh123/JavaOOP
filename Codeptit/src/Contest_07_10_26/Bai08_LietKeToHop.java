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
public class Bai08_LietKeToHop {
    static int[] arr;
    static int n,k;
    static int cnt = 0;
    public static void Try(int pos){
        for (int j = arr[pos-1]+1; j <= n - k + pos;++j){
            arr[pos] = j;
            if (pos == k){
                for (int i = 1; i <= k; ++i){
                    System.out.print(arr[i]+" ");
                }
                cnt+=1;
                System.out.println("");
            }
            else{
                Try(pos+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         k = sc.nextInt();
        arr = new int[k+1];
        arr[0] = 0;
        Try(1);
        System.out.printf("Tong cong co %d to hop", cnt);
    }
}
