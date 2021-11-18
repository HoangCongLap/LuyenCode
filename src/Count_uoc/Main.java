package Count_uoc;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class Main {

    public static int checkUoc(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return count;
    }

public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        do {
            a = scanner.nextInt();
        } while (a != 0 && a>1000);
        a = Math.abs(a);
        int KT = checkUoc(a);
        System.out.println(+KT);
    }
}
