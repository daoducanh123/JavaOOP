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
public class Bai13_TongUocSo_1 {
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

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         SangSONto();
        long sum = 0;
        while (t-->0){
            int n = sc.nextInt();
            for (int p:listPrimes){
                if (p * p > n) break;
                while (n % p == 0){
                    sum += p;
                    n /=p;
                }
            }
            if (n > 1){
                sum +=n;
            }
        }
         System.out.println(sum);
     
     }
     
}
