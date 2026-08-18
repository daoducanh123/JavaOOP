package codeptit;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class J01013_TongUocSo1 {
    private static final int MAXN = 2000001; // nghĩa là biến số nguyên nhưng sau khi gán giá trị thì không thể thay đổi nữa.

    private static boolean[] is_prime = new boolean[MAXN];
    private static ArrayList<Integer> primes = new ArrayList<>();

    private static void SangSoNTO(){
        Arrays.fill(is_prime, true);
        is_prime[0] = false;
        is_prime[1] = false;

        for (int i = 2; i * i <= MAXN-1; ++i){
            if (is_prime[i] == true){
                for (int j = i * i; j <= MAXN-1; j += i){
                    is_prime[j] = false;
                }
            }
        }
        // add vào list
        for (int i = 2; i < MAXN; i++) {
            if (is_prime[i]) {
                primes.add(i);
            }
        }
    }

    public static void main(String[] args) {
        SangSoNTO();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            for (Integer p : primes) {
                if (p * p > n) break;

                while(n % p == 0){
                    sum += p;
                    n /= p;
                }
            }
            if (n > 1){
                sum += n;
            }

        }
        System.out.println(sum);
        sc.close();
    }
}
