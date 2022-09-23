
import java.util.*;
import java.io.*;

public class Permutations {

    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.nextInt();
        if (n == 2 || n == 3) {
            out.println("NO SOLUTION");
        } else {
            for (int i = 2; i <= n; i += 2) {
                out.print(i + " ");
            }
            for (int i = 1; i <= n; i += 2) {
                out.print(i + " ");
            }
            out.println();
        }

        out.flush();
    }

}