package codeptit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAGaming
 */
import java.util.*;
public class J04021_IntSet {
    public static class IntSet{
        TreeSet<Integer> treeSet = new TreeSet<>();
        public IntSet(int[] arr){
            for (int a : arr){
                treeSet.add(a);
            }
        }
        public IntSet(){
            
        }
        public IntSet union(IntSet other){
            IntSet s3 = new IntSet();
            for (int a: this.treeSet){
                s3.treeSet.add(a);
            }
            for (int aa: other.treeSet){
                s3.treeSet.add(aa);
            }
            return s3;
        }
        @Override 
        public String toString(){
            StringBuilder sb = new StringBuilder();
            for(int x:this.treeSet){
                sb.append(x).append(" ");
            }
            return sb.toString().trim();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
