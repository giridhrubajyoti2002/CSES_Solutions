
import java.util.*;
import java.io.*;

public class Missing_Number {

    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.nextInt();
        boolean[] arr = new boolean[n + 1];
        for (int i = 0; i < n - 1; i++) {
            arr[in.nextInt()] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (arr[i] == false) {
                out.println(i);
                break;
            }
        }

        out.flush();
    }

}