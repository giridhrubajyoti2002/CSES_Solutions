
import java.util.*;
import java.io.*;

public class Gray_Code {

    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append('0');
        }
        f(sb, n - 1);
        out.flush();
    }

    static void f(StringBuilder sb, int n) {
        if (n < 0) {
            out.println(sb.toString());
            return;
        }
        f(sb, n - 1);
        sb.replace(n, n + 1, String.valueOf(sb.charAt(n) == '0' ? '1' : '0'));
        f(sb, n - 1);
    }

}