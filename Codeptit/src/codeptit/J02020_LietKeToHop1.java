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
        
                // 1. Tìm vị trí cuối cùng còn có thể tăng
        int i = k;

        while (i >= 1 && a[i] == n - k + i) {
            i--;
        }

        // Không còn vị trí nào tăng được
        if (i == 0) {
            return;
        }

        // 2. Tăng a[i]
        a[i]++;

        // 3. Các phần tử phía sau tăng dần nhỏ nhất
        for (int j = i + 1; j <= k; j++) {
            a[j] = a[j - 1] + 1;
        }
    }
    }
}
