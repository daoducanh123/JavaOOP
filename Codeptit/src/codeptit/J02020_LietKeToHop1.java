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
public class J02020_LietKeToHop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int [] arr = new int[k+1];
        for (int i = 1; i <= k; ++i){
            arr[i] = i;
        }
        //     i = k
        // 1 3 5
        int cnt = 0;
        while (true){

            // 1. Tìm vị trí cuối cùng còn có thể tăng
            int i = k;
            for (int id = 1; id < arr.length; ++id){
                 System.out.print(arr[id] + " ");
            }
            cnt += 1;    
            System.out.println("");
            while (i >= 1 && arr[i] == n - k + i) {
                i--;
            }

            // Không còn vị trí nào tăng được
            if (i == 0) {
                break;
            }

            // 2. Tăng a[i]
            arr[i]++;

            // 3. Các phần tử phía sau tăng dần nhỏ nhất
            for (int j = i + 1; j <= k; j++) {
                arr[j] = arr[j - 1] + 1;
            }
        }
        System.out.println("Tong cong co" + " " + cnt + " to hop");
    }
  
}
