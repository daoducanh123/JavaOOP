package codeptit;
import java.util.*;
public class J02019_TongUocSo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        long[] sum = new long[b + 1];

        // sieve
        for (int i = 1; i <= b/2; i++) { // ước 1 -> b
            for (int j = 2*i; j <= b; j += i) { // 2b 3b 4b 5b
                sum[j] += i;
            }
        }

        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (sum[i] > i) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}