
import java.util.*;
import java.io.*;

public class Two_Sets {

    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.nextInt();
        long x = n * (n + 1) / 2;
        if (x % 2 == 1 || n % 4 == 1 || n % 4 == 2) {
            out.println("NO");
        } else {
            ArrayList<Integer> list_1 = new ArrayList<>();
            ArrayList<Integer> list_2 = new ArrayList<>();
            int i = 1;
            if (n % 4 == 3) {
                list_1.add(i++);
                list_1.add(i++);
                list_2.add(i++);
            }
            while (i < n - 2) {
                list_1.add(i++);
                list_2.add(i++);
                list_2.add(i++);
                list_1.add(i++);
            }
            out.println("YES");
            out.println(list_1.size());
            for (int e : list_1) {
                out.print(e + " ");
            }
            out.println();
            out.println(list_2.size());
            for (int e : list_2) {
                out.print(e + " ");
            }
        }

        out.flush();
    }

}