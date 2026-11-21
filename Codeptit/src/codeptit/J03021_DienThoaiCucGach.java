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

        ArrayList<String>[] list = new ArrayList[10];

        for (int i = 0; i <= 9; ++i) {
            list[i] = new ArrayList<>();
        }

        list[2].add("ABC");
        list[3].add("DEF");
        list[4].add("GHI");
        list[5].add("JKL");
        list[6].add("MNO");
        list[7].add("PQRS");
        list[8].add("TUV");
        list[9].add("WXYZ");

        while (n-- > 0) {
            String s = sc.nextLine().toUpperCase();
            StringBuilder stringNum = new StringBuilder();

            for (int k = 0; k < s.length(); ++k) {
                char c = s.charAt(k);

                for (int i = 2; i <= 9; ++i) {
                    if (list[i].get(0).contains(String.valueOf(c))) {
                        stringNum.append(i);
                        break;
                    }
                }
            }

            if (check(stringNum.toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}