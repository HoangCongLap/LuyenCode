package CountNumberSpace;

/**
 *
 * @author LapHoang
 */
import java.io.*;
import java.util.*;

public class CountNumberSpace {

    public static int Count(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (i == s.length() - 1 || ' ' != s.charAt(i + 1)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean DEBUG = true;

    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = DEBUG ? new FileInputStream("input.txt") : System.in;
// tao file input cùng cap voi src.
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(is)));
        int T = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < T; i++) {
            String s = scanner.nextLine();
            System.out.println(Count(s));
        }
    }
}
