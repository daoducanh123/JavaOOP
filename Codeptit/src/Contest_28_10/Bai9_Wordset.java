/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_28_10;
import java.util.*;
class WordSet{
    TreeSet<String> set = new TreeSet<>();
    WordSet (String s){
        for (String wordString: s.toLowerCase().split("\\s+")){
            if(!wordString.isEmpty()) set.add(wordString);
        }
    }
    WordSet union(WordSet other){
        WordSet result = new WordSet("");
        result.set.addAll(set);
        result.set.addAll(other.set);
        return result;
    }
    WordSet intersection(WordSet other){
        WordSet result = new WordSet("");
        result.set.addAll(set);
        result.set.retainAll(other.set);
        return result;
    }
    public String toString(){
        return String.join (" ",set);
    }
}

public class Bai9_Wordset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet (in.nextLine());
        WordSet s2 = new WordSet (in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
