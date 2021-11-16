package UCLN_2_number_VL14;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class Main {

    public static int checkUoc(int a, int b) {
        int max = 0;
        if (a == 0) {
            max = b;
        }
        if (b == 0) {
            max = a;
        }
        if (a > 0 && b > 0) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    max = i;
                    if (i > max) {
                        max = i;
                    }

                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } while (a == 0 && b == 0);
        a=Math.abs(a);
        b=Math.abs(b);
        int number;
        if (a > b) {
            number = a;
            a = b;
            b = number;
        }
        int KT = checkUoc(a, b);
        System.out.println( + KT);
    }
}
