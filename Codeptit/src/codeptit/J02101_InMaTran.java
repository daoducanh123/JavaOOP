
package codeptit;
import java.util.*;

public class J02101_InMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[][] arr = new int[n+1][n+1];
            for (int i = 1; i <= n; ++i){
                for (int j = 1; j <= n; ++j){
                    int x = sc.nextInt();
                    arr[i][j] = x;
                }
            }
            
            for (int i = 1; i <= n; ++i){
                if (i % 2 == 0){
                    for (int j = n; j >= 1; --j){
                        System.out.print(arr[i][j] + " ");
                    }
                }
                else{
                    for (int j = 1; j <= n; ++j)
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
