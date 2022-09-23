
import java.util.*;
import java.io.*;

public class Weird_Algorithm {

    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        long n = in.nextLong();
        out.print(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            out.print(" " + n);
        }
        out.println();

        out.flush();
    }

}