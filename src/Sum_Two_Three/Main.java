package Sum_Two_Three;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class Main {
//====================SUM2==============================
//    public static void main(String[] args) {
//        int n;
//        long  sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            n = scanner.nextInt();
//        } while (n <= 0);
//        for (long i = 1; i <= n; i++) {
//            sum += i * i;
//        }
//        System.out.println("sum:" + sum);
//    }
//}

//======================SUM3================================
    public static void main(String[] args) {
        int n;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (float i = 1; i <= n; i++) {
            sum += 1.0*(1 / (i * (i + 1)));
        }
        System.out.printf("%.5f",sum);
    }
}
