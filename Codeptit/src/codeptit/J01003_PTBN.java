package codeptit;
import java.util.Scanner;

public class J01003_PTBN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        if (b == 0 && a == 0){
            System.out.println("VSN");
        }
        else if (a == 0){
            System.out.println("VN");
        }
        else if (a != 0){
            System.out.printf("%.2f", -b/a);
        }

        scanner.close();
    }
}
