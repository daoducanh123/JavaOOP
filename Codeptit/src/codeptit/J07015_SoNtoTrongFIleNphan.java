/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.io.*;

/**
 *  x
 * @author DAGaming
 */
public class J07015_SoNtoTrongFIleNphan {
    static boolean[] isPrime = new boolean[10001];
    static void Sang(){
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= 10000; ++i){
            if (isPrime[i] == true){
                for (int j = i * i; j <= 10000; j += i){
                    isPrime[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        Sang();
        FileInputStream f = new FileInputStream ("SONGUYEN.in");
        ObjectInputStream o = new ObjectInputStream(f);
        ArrayList<Integer> a = (ArrayList <Integer>)o.readObject(); // Typecasting
        o.close();
        
        TreeMap<Integer,Integer> tMap = new TreeMap<>();
        for (int i = 0; i < a.size();++i){
            if (isPrime[a.get(i)]== true){
                if (tMap.containsKey(a.get(i))){
                    tMap.put(a.get(i), tMap.get(a.get(i))+1);
                }
                else{
                    tMap.put(a.get(i), 1);
                }
            }
        }
        for (Map.Entry<Integer,Integer> x: tMap.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        
    }
}
