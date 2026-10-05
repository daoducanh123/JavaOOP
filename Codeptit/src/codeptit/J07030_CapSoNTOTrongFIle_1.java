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
public class J07030_CapSoNTOTrongFIle_1 {

    
    static final int N = 1000000;
    static boolean[] isPrime = new boolean[N+1];
    public static void Sang(){
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= N; ++i){
            if (isPrime[i] == true){
                for (int j = i * i; j <= N; j += i){
                    isPrime[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception{
        Sang();
        FileInputStream f1 = new FileInputStream("DATA1.in");
        FileInputStream f2 = new FileInputStream("DATA2.in");
        ObjectInputStream o1 = new ObjectInputStream(f1);
        ObjectInputStream o2 = new ObjectInputStream(f2);
        
        
        ArrayList<Integer> list1 = (ArrayList<Integer>)o1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>)o2.readObject();
        o1.close(); o2.close();
        
        // ChuyenSang Set  do ko lặp lại
        Set <Integer> se1 = new HashSet<Integer>(list1);
        Set <Integer> se2 = new HashSet<Integer>(list2);
        
        ArrayList<Integer> list = new ArrayList<>(se1);
        Collections.sort(list);
        for (int x : list){
            int y = 1000000 - x;
            if (x < y && isPrime[x] && isPrime[y] && se2.contains(y)){
                System.out.println(x + " " +y);
            }
        }
    }
}
