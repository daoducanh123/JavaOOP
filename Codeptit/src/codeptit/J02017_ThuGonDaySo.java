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
public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i< n; ++i){
            a[i] =sc.nextInt();
        }
        
        Stack<Integer> st = new Stack<Integer>();
        st.push(a[0]);
        for (int i = 1; i < n; ++i){
            if (st.empty() == true || (st.peek() +a[i]) % 2 != 0){
                st.push(a[i]);
            }
            else{
                st.pop();
            }
            
        }
        System.out.println(st.size());
      //  while (!st.empty()){
        //    System.out.println(st.peek());
          //  st.pop();
        //}
        sc.close();
    }
//    10
// 1 5 5 8 6 4 3 5 9 3

}
