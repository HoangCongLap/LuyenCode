package Tich_max_3_number;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class Main {

    public static void main(String[] args) {
//                int n;
//                Scanner scanner = new Scanner(System.in);
//                do {
//                    n = scanner.nextInt();
//                } while (n < 3 || n > 10000);
//                int[] a = new int[n];
//        int a[] = {0, 0, 0, 0, 0};
        int a[] = {-1, -2, -3, -4};
        int n = a.length;
        //          int a[]={-1,-2,-3,3};
//            int a[]={-1,-2,0,1,2};
//        int a[] = {-4,-1,1,8,9,2};
// int a[]={-6,-7,-1,0,1,2,3};
        // int n = a.length;
//        for (int i = 0; i < n; i++) {
//            a[i] = scanner.nextInt();
//        }
        int sx = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    sx = a[i];
                    a[i] = a[j];
                    a[j] = sx;
                }
            }
        }
        System.out.print("SX:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        int tich1 = 0, tich2 = 0, tich3 = 0, tich4 = 0, tich5 = 0;
        if (a[0] >= 0) {
            tich1 = a[n - 1] * a[n - 2] * a[n - 3];
            System.out.println("tich1: " + tich1);
        } else if (a[n - 1] < 0) {
            tich2 = a[n - 1] * a[n - 2] * a[n - 3];

            System.out.println("tich2: " + tich2);
        } else {
            if (a[0] * a[1] > 0) {
                tich4 = a[n - 1] * a[0] * a[1];
                tich5 = a[n - 1] * a[n - 2] * a[n - 3];
                if (tich4 > tich5) {
                    System.out.println("\ntich4: " + tich4);
                } else {
                    System.out.println("\ntich5: " + tich5);
                }
            } else {
                tich3 = a[n - 1] * a[n - 2] * a[n - 3];
                System.out.println("tich3: " + tich3);
            }
        }
    }
}
