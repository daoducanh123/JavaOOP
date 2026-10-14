///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Contest_7_10_26;
//import java.util.*;
///**
// *
// * @author DAGAMING
// */
//public class Bai10_DayConCoTongNguyenTo {
//        static boolean isPrime(int n){
//            if (n < 2) return false;
//            for(int i = 2; i *i <=n ; ++i){
//                if (n%i==0) return false;
//            }
//            return true;
//        }
//        
//        static void backtrack (int idx, int currentSum, List<Integer> current, Integer[] a, List<String> results){
//            for (int i = idx; i < a.length; ++i){
//                current.add(a[i]);
//                int newSum = currentSum + a[i];
//                if (isPrime(newSum)){
//                    StringBuilder sb = new StringBuilder();
//                    for (int j = 0 ; j < current.size(); ++j){
//                        sb.append(current.get(j));
//                        if(j<current.size()-1) sb.append(" ");
//                    }
//                    results.add(sb.toString());
//                }
//                backtrack(i+1, newSum, current, a, results);
//                current.remove(current.size()-1);
//            }
//        }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int t= sc.nextInt();
//        while(t-->0){
//            int n = sc.nextInt();
//            Integer[] a = new Integer[n];
//            for(int i = 0; i < n; ++i){
//                a[i] = sc.nextInt();
//            }
//            Arrays.sort(a,Collections.reverseOrder());
//            List<String> results = new ArrayList<>();
//            List<Integer> current = new ArrayList<>();
//            backtrack(0,0,current,a,results);
//            results.sort((x,y)->{
//                String[] a1= x.split(" ");
//                String[] a2 =y.split(" ");
//            }
//            for (String s : results){
//                System.out.println(s);
//            }
//        }
//        
//        
//    }
//}
