/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_28_10;
import java.util.*;
/**
 *
 * @author DAGaming
 */
public class Bai7_LopPair {
    static class Pair<T,U>{
        T first;
        U second;
        
        Pair (T first, U second){
            this.first = first;
            this.second = second;
        }
        boolean isPrime(){
            return prime((Integer) first) && prime((Integer) second);
        }
        boolean prime(int n){
            if(n<2) return false;
            for(int i = 2; i <= Math.sqrt(n); ++i){
                if (n % i == 0) return false;
            }return true;
        }
        
        public String toString(){
            return first + " "+ second;
        }
    }
        
        
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t =  sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2*Math.sqrt(n);++i){
                Pair<Integer,Integer> p = new Pair<>(i,n-i);
                if (p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
