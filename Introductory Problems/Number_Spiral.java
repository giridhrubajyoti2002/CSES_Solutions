
import java.util.*;
import java.io.*;

public class Number_Spiral {

    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int tt = in.nextInt();

        while (tt-- != 0) {
            long x = in.nextLong();
            long y = in.nextLong();
            long max = Math.max(x, y);
            long min = Math.min(x, y);
            long n = max - 1;
            long ans = n * n;
            if (max == x) {
                ans += n % 2 == 0 ? y : max + max - y;
            } else {
                ans += n % 2 == 0 ? max + max - x : x;
            }
            out.println(ans);
        }

        out.flush();
    }

}