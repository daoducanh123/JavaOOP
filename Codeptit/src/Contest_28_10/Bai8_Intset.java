package Contest_28_10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
/**
 *
 * @author DAGaming
 */
public class Bai8_Intset {
    static class IntSet {
        TreeSet<Integer> set = new TreeSet<>();

        IntSet(int[] a){
            for(int x:a){
                set.add(x);
            }
            
        }
        IntSet union(IntSet other){
            IntSet result = new IntSet(new int[0]);
            result.set.addAll(set);
            result.set.addAll(other.set);
            return result;
        }
        public String toString(){
            StringBuilder sb = new StringBuilder();
            for(int x:set){
                sb.append(x).append(" ");
            }
            return sb.toString().trim();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[]=new int [m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
        
    }
}
