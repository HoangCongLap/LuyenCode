package checknumer_hoan_hao.thien;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int sum = 0;
         int number;
        Scanner scanner = new Scanner(System.in);
         do{
               number = scanner.nextInt();
         }while (number>1000000000);  
        if (number <= 0) {
            sum=-1;
        } else {
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
        }
        if (sum == number) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
