package codeptit;

import java.util.*;

public class J01014_UocSoNtoLonNhat {

    private static final int Maxn = 100001;
    private static boolean[] is_prime = new boolean[Maxn];
    private static ArrayList<Integer> primes = new ArrayList<>();

    private static void SangSoNguyenTo(){
        Arrays.fill(is_prime, true);
        is_prime[0] = is_prime[1] = false;

        for (int i = 2; i <= Math.sqrt(Maxn-1); ++i){
            if (is_prime[i] == true){
                for (int j = i * i; j <= Maxn-1; j += i){
                    is_prime[j] = false;
                }
            }
        }

        for (int i = 0; i < Maxn; ++i){
            if (is_prime[i] == true){
                primes.add(i);
            }
        }
    }

    private static long largestPrimeFactor(long n){
        long res = 1;
        for (int p : primes) {
            if (p <= Math.sqrt(n)){

                while (n % p == 0){
                    res = p;
                    n /= p;
                }
            }
            else break;
        }
            if (n > 1) res = n;

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SangSoNguyenTo();

        int T = sc.nextInt();

        while (T-- > 0) {
            long n = sc.nextLong();
            System.out.println(largestPrimeFactor(n));
        }
        sc.close();
    }
}