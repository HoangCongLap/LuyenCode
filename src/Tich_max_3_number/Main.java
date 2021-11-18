package Tich_max_3_number;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class Main {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            n = scanner.nextInt();
        } while (n < 3 || n > 10000);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
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
        int tich1 = 0;
        int count1 = 0;
        int tich2 = 0;
        int count2 = 0;
        int tich3 = 0;
        int count3 = 0;
        for (int i = 0; i < n; i++) {
            if (a[0] >= 0) {
                tich1 = a[n - 1] * a[n - 2] * a[n - 3];
                count1++;
            } else if (a[n - 1] < 0) {
                tich2 = a[n - 1] * a[n - 2] * a[n - 3];
                count2++;
            } else if (a[n - 1] >= 0 && a[0] < 0) {
                tich3 = a[n - 1] * a[0] * a[1];
                count3++;
            }
        }
        if (count1 != 0) {
            System.out.println("\ntich1: " + tich1);
        } else if (count2 != 0) {
            System.out.println("\ntich2: " + tich2);
        } else if (count3 != 0) {
            System.out.println("\ntich3: " + tich3);
        }

    }
}
