
import java.util.*;
import java.io.*;

public class Increasing_Array {

    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.nextInt();
        long ans = 0;
        int prev = in.nextInt();
        for (int i = 1; i < n; i++) {
            int curr = in.nextInt();
            if (prev > curr) {
                ans += prev - curr;
            } else {
                prev = curr;
            }
        }
        out.println(ans);

        out.flush();
    }

}