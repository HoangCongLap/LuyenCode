package TinhTong_L09;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class TongMuchiaGiaiThua {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int n=scanner.nextInt();
        int giaiThua =1;
        float sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=(float) (pow(x,i))/(float)(giaiThua*=i);
//           giaiThua*=i;
//             System.out.println("Sum:"+sum);
        }
//         System.out.println("giai thua:"+(giaiThua));
        System.out.format("%.2f",sum);
    }
}
