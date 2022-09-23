
import java.util.*;
import java.io.*;

public class Palindrome_Reorder {

    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String s = in.next();
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'A']++;
        }
        int flag = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 1) {
                flag++;
            }
        }
        if (flag > 1) {
            out.println("NO SOLUTION");
        } else {
            char ch = ' ';
            for (int i = 0; i < 26; i++) {
                if (arr[i] % 2 == 1) {
                    ch = (char) ('A' + i);
                }
                for (int j = 0; j < arr[i] / 2; j++) {
                    out.print((char) ('A' + i));
                }
            }
            if (ch != ' ') {
                out.print(ch);
            }
            for (int i = 25; i >= 0; i--) {
                for (int j = 0; j < arr[i] / 2; j++) {
                    out.print((char) ('A' + i));
                }
            }
            out.println();
        }

        out.flush();
    }

}