
import java.util.*;
import java.io.*;

public class Repetitions {

    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String s = in.next();
        int ans = 0;
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                ans = Math.max(cnt, ans);
                cnt = 1;
            }
        }
        ans = Math.max(cnt, ans);
        out.println(ans);

        out.flush();
    }

}