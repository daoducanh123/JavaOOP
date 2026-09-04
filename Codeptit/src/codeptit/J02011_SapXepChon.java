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


    // 4 
    // 5 7 3 2

    // i     j
    // 5 7 3 2
    //+2 7 3 5 b1
    //   i j
    // 2 7 3 5
    //+2 3 7 5 b2

    //     i j
    // 2 3 7 5
    //+2 3 5 7 b3
    public class J02011_SapXepChon {
        public static void Print(int arr[], int n) {
            for (int i = 0; i < n; ++i) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n - 1; ++i) {

                // Tìm vị trí phần tử nhỏ nhất
                int pos = i;

                for (int j = i + 1; j < n; ++j) {
                    if (arr[j] < arr[pos]) {
                        pos = j;
                    }
                }

                // Đổi chỗ
                int tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;

                // In từng bước
                System.out.print("Buoc " + (i + 1) + ": ");
                Print(arr, n);
            }
        }
    }