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
public class ICPC0106_DoiCoSo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        while (n -->0){

            int b = sc.nextInt();
            int c = 0;
            sc.nextLine();
            String s = sc.nextLine();
            boolean okBreak = false;
            switch(b){
                    case 2:
                        System.out.println(s);
                        okBreak = true;
                        break;
                    case 4: 
                        c = 2;
                        break;
                    case 8:
                        c = 3;
                        break;
                    case 16:
                        c = 4;
                        break;
                    default:
                        break;
            }
            if (okBreak == true){
                break;
            }
            
            // k = 4
            // Số bit cần thêm vào đầu
            int padding = 0;
            if (s.length() % c != 0){
                padding = c - (s.length() % c);
            }
            // Gheps
            // 0001 1001 0101 
            String paddString = "";
            for (int i = 1; i<= padding; ++i){
                paddString += 0;
            }
            s = paddString + s;
            
            ArrayList<Integer> res = new ArrayList<Integer>();
            
            for (int i = 0; i < s.length(); i += c){
                String group = s.substring(i, i+c);
                int num = Integer.parseInt(group,2);
                res.add(num);
            }
            for (int i = 0; i< res.size();++i){
                System.out.print(res.get(i));
            }
            System.out.println("");
        }
        sc.close();
    }
}
