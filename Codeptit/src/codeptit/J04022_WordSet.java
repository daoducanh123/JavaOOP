/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.*;
/**
 *
 * @author DAGaming
 */
public class J04022_WordSet {
    public static class WordSet{
        TreeSet<String> treeSet = new TreeSet<>();

        public WordSet(String s) {
            String[] arrString = s.trim().toLowerCase().split("\\s+");
            for (int i = 0; i < arrString.length; ++i){
                treeSet.add(arrString[i]);
            }
        }
        public WordSet(){
            
        }
        public WordSet union(WordSet other){
            WordSet unionSet = new WordSet();
            for (String s1: this.treeSet){
                unionSet.treeSet.add(s1);
            }
            for (String s2: other.treeSet){
                unionSet.treeSet.add(s2);
            }
            return unionSet;
        }
        public WordSet intersection(WordSet other){
            WordSet intersectionSet = new WordSet();
            for (String s1: this.treeSet){
                if (other.treeSet.contains(s1)){
                    intersectionSet.treeSet.add(s1);
                }
            }
            return intersectionSet;
        }
                
        @Override
        public String toString(){
            return String.join(" ", treeSet);
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine()); // s = Dao Duc Anh   dep trai    qua !
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
