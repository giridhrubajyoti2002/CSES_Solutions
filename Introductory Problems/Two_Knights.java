
import java.util.*;
import java.io.*;

public class Two_Knights {

    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        long n = in.nextInt();
        for (long i = 1; i <= n; i++) {
            long cnt;
            if (i >= 4) {
                cnt = (i - 4) * (i - 4) * 8;
                cnt += ((i - 4) * (4 + 6)) * 4;
                cnt += (2 + 3 + 4 + 3) * 4;
                System.out.println((i * i - 1) * ((i * i - 1) + 1) / 2 - cnt / 2);
            } else if (i == 1) {
                System.out.println(0);
            } else if (i == 2) {
                System.out.println(6);
            } else if (i == 3) {
                System.out.println(28);
            }
        }

        out.flush();
    }

}