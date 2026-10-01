/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.io.*;

/**
 *
 * @author DAGaming
 */
public class J07029_SoNtoMaxTrongFIle {
    static int[] isPrime = new int [1000005];
    static void sang(){
        Arrays.fill(isPrime, 1);
        isPrime[0] = isPrime[1] = 0;
        for (int i = 2;i * i <= 1000000; i++){
            if (isPrime[i]==1){
                for (int j = i*i; j<=1000000; j+=i){
                    isPrime[j] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args)throws Exception {
        sang();
        FileInputStream f = new FileInputStream("DATA.in");
        ObjectInputStream obj = new ObjectInputStream(f);
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList = (ArrayList<Integer>)obj.readObject();
        int n = arrayList.size();
        
        int [] count = new int [1000005];
        Arrays.fill(count, 0);
        for (int i = 0; i < n; ++i){
            if (isPrime[arrayList.get(i)]== 1){
                count[arrayList.get(i)] += 1;
            }
        }
        
        int cnt = 0;
        for (int i = 1000000; i >= 0; i --){
            if (cnt == 10){
                break;
            }
            else{
                if (count[i] > 0){
                    System.out.println(i + " " + count[i]);
                    cnt++;
                }
            }
        }
        
        
    }
}
