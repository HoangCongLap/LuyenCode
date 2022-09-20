package CountNumberSpace;

/**
 *
 * @author LapHoang
 */
import java.io.*;
import java.util.*;

public class Main {

    public static int Count(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                count++;
            }
        }
        return count;
    }

    private static boolean DEBUG = true;

    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = DEBUG ? new FileInputStream("input.txt") : System.in;
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(is)));
        Scanner sc = new Scanner(is);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(s);
            if (Count(s) != 0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
