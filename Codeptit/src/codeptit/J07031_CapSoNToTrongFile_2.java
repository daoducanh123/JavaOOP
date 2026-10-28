/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
import java.io.*;


public class J07031_CapSoNToTrongFile_2 {
    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        else{
            for (int i = 2; i * i <= n; ++i){
                if (n%i==0){
                    return false;
                }
            }return true;
        }
    }
    public static void main(String[] args) throws Exception{
        FileInputStream f1 = new FileInputStream("DATA1.in");
        FileInputStream f2 = new FileInputStream("DATA2.in");

        ObjectInputStream obj1 = new ObjectInputStream (f1);
        ObjectInputStream obj2 = new ObjectInputStream (f2);

        ArrayList <Integer> list1;
        list1 = (ArrayList<Integer>)obj1.readObject();
        ArrayList <Integer> list2;
        list2 = (ArrayList<Integer>)obj2.readObject();
        
        TreeSet <Integer> treeSet1 = new TreeSet<>(list1);
        TreeSet <Integer> treeSet2 = new TreeSet<>(list2);
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int l : treeSet1) {
        int ll = 1000000 - l;

            if (l < ll
                    && !treeSet2.contains(l)
                    && treeSet1.contains(ll)
                    && !treeSet2.contains(ll)
                    && isPrime(l)
                    && isPrime(ll)) {
                System.out.println(l + " " + ll);
            }
        }
    }
}
