package codeptit;

import java.util.*;

public class J03027_RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            if (st.size() > 0 && s.charAt(i) == st.peek()) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        if (st.size() == 0) {
            System.out.println("Empty String");
        } else {
            StringBuilder res = new StringBuilder();

            while (st.size() > 0) {
                res.append(st.peek());
                st.pop();
            }

            System.out.println(res.reverse());
        }
    }
}