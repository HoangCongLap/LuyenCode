package Print_Number_âm;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
// chua xong
public class Main {

    public static void main(String[] args) {
        int n, i = 0, count = 0;
        int arr[] = new int[1000];
        Scanner scanner = new Scanner(System.in);
        do {
            n = scanner.nextInt();
            if (n < 0) {
                arr[i++] = n;
                count++;
            }
        } while (n != 0);
        if (count != 0) {
            System.out.print(+arr[0]);
            for (i = 1; i < count; i++) {
                System.out.print(" " + arr[i]);
            }
        } else {
            System.out.print("NOT FOUND");
        }
    }
}
