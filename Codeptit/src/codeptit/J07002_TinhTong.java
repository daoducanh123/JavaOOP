package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File ("DATA.in");
        Scanner sc = new Scanner(f);
        long sum = 0;
            while (sc.hasNext()){
                String s = sc.next();
                try{
                    int x = Integer.parseInt(s);
                    sum += x;
                }
                catch (NumberFormatException e){
                      // Không phải số int → bỏ qua
                }
            }
                    System.out.println(sum);
                    sc.close();

    }
}