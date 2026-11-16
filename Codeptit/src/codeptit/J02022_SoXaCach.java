
package codeptit;
import java.util.*;

public class J02022_SoXaCach {

    static int n;
    static int[] a;
    static boolean[] used;
    
    public static boolean Check(){
        for (int i = 1; i < a.length; ++i){
            if (Math.abs(a[i]-a[i-1]) == 1){
                return false;
            }
        }return true;
    }
    public static void Try(int pos){
        for (int value = 1; value <= n; ++ value){
            if (used[value] == false){
                used[value] = true;
                a[pos] = value;
                
                if (pos == n-1){
                    if (Check()){
                        for (int aa:a){
                            System.out.print(aa);
                        }
                        System.out.println("");
                    }
                }
                else{
                    Try(pos+1);
                }
                used[value] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            a = new int [n];
            Arrays.fill(a,0);
            used = new boolean [n+1];
            Arrays.fill(used, false);
            Try(0);
            System.out.println("");
        }
    }
    
}


