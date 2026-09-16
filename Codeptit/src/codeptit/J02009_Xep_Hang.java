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
public class J02009_Xep_Hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][]arr = new int[n][2];
        for (int i = 0; i < n; ++i){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i][0]= x;
            arr[i][1]=y;
        }
        
        Comparator<int[]> cmp = (x,y)->Integer.compare(x[0], y[0]); // (y[0],x[0]) laf nguoc lại
                                                                    // Nếu muốn xếp theo phần tử thứ hai (arr[i][1]) thì chỉ cần đổi [0] thành [1].
        Arrays.sort(arr, cmp);
        
        int[] end = new int[n];
        end[0] = arr[0][0] + arr[0][1];
        int[][] arr_new = Arrays.copyOf(arr, n); 
        for (int i = 1 ; i < n; ++i){
            if (arr[i][0] < end[i-1]){
                arr_new[i][0] = end[i-1];
                end[i] = arr_new[i][0] + arr_new[i][1];
            }
            else{
                end[i] = arr[i][0] + arr[i][1];
            }
        }
        System.out.println(end[n-1]);
        
    }
}
