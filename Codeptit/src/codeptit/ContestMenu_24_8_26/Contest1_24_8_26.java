package codeptit.ContestMenu_24_8_26;
import java.util.Scanner;

public class Contest1_24_8_26 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       boolean hasN = false;
       int choice = 0;
       int n = -1;
       while (sc.hasNextInt()){
           choice = sc.nextInt();
           switch(choice){
               case 1:
                   n = sc.nextInt();
                   hasN = true;
                   break;
               case 2:
                   if (hasN){
                        int sum = 0;
                        for (int i = 1; i <= n; ++i){
                            sum += i;
                        }
                         System.out.println(sum);
                    }
                   else{
                       System.out.println("chon 1"); 
                   }
                   break;
               case 3:
                   double a = sc.nextDouble();
                   double b = sc.nextDouble();
                   double res = 0.0;
                   
                   res = (a*2+b) /3;
                   System.out.printf("%.2f", res);
                   break;
               case 0:
                   sc.close();
                   return;
               default:
                   System.out.println("chon 0, 1, 2,3");
                    break;
           }
       }
    }
}
