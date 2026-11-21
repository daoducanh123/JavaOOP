import java.util.*;

public class J03021_DienThoaiCucGach {

    public static boolean check(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        list.add("JKL");
        list.add("MNO");
        list.add("PQRS");
        list.add("TUV");
        list.add("WXYZ");

        while (n-- > 0) {
            String s = sc.nextLine().toUpperCase();
            StringBuilder stringNum = new StringBuilder();

            for (int k = 0; k < s.length(); ++k) {
                char c = s.charAt(k);

                for (int i = 0; i <= 7; ++i) {
                    if (list.get(i).contains(String.valueOf(c))) {
                        stringNum.append(i+2);
                        break;
                    }
                }
            }
            
            // StringBuilder -> String thường
            if (check(stringNum.toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}