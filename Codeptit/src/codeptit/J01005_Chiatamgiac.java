package codeptit;

import java.util.Scanner;

public class J01005_Chiatamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            int B = 1;
            int N = scanner.nextInt();
            int H = scanner.nextInt();
            double k = (0.5 * B * H) / N; // k la dien tich mỗi phần -> k*i = s: là diện tích mỗi tam giác con

            // tam giasc đồng dạng: b/B = h/H  ->                      b = h/H
            // s = 0.5f x b x h -> s = 0.5f * h * h / H ->          h = sqrt(2sH) -> h = sqrt(2k*i*H)  
            for (int i = 1; i < N; i++) {
                double h =  Math.sqrt(2*k*i*H);
                System.out.printf("%.6f ", h);
            }       
            System.out.println();
        }
    scanner.close();    
    }
}
