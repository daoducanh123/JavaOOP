/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_16_9_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class Bai14_UocSoNToLonNhat {
    static final int Maxn = 2000001;
    static ArrayList<Integer> listPrimes = new ArrayList<>();
    static boolean[] arrIsPrime = new boolean[Maxn];
    static void SangSONto(){
        Arrays.fill(arrIsPrime,true);
        arrIsPrime[0] = false;
        arrIsPrime[1] = false;
        // 0 1 2 3 4 5 6 7 8 9 10
        for (int i = 2; i <= (int)Math.sqrt(Maxn)-1; ++i){
            if (arrIsPrime[i] == true){
                for (int j = i * i; j <= Maxn-1; j+=i){
                    arrIsPrime[j] = false;
                }
            }
        }
        for (int i = 0; i < Maxn;++i){
            if (arrIsPrime[i] == true){
                listPrimes.add(i);
            }
        }
    }
    static long largestPrimeFactor(long n){
        long res = 1;
        for (int p:listPrimes){
            while (n % p == 0){
                res = p;
                n/=p;
            }
            if (n > 1){
                res = n;
            }
        }
        return res;
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SangSONto();
        int t = sc.nextInt();

        while (t-->0){
            long n = sc.nextLong();
            System.out.println(largestPrimeFactor(n));
        }
    }
}
