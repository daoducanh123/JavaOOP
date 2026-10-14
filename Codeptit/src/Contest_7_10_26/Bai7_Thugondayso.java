/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest_7_10_26;
import java.util.*;
/**
 *
 * @author DAGAMING
 */
public class Bai7_Thugondayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < n ; ++i){
            int x = sc.nextInt();
            if (!st.empty() && (st.peek()+x) % 2==0){
                st.pop();
            }
            else{
                st.push(x);
            }
        }
        System.out.println(st.size());
    }
}
