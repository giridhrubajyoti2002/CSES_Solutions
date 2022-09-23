
import java.util.*;
import java.io.*;

public class Creating_Strings{
    
    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(in.next());
        HashSet<String> set = new HashSet<>();
        f(set, sb, 0);
        out.println(set.size());
        String[] arr = set.toArray(new String[set.size()]);
        Arrays.sort(arr);
        for (String s : arr) {
            out.println(s);
        }
 
        out.flush();
    }
    static void f(HashSet<String> set, StringBuilder sb, int pos) {
        if (pos >= sb.length()) {
            set.add(sb.toString());
            return;
        }
        for (int i = pos; i < sb.length(); i++) {
            swap(sb, pos, i);
            f(set, sb, pos + 1);
            swap(sb, pos, i);
        }
    }
    static void swap(StringBuilder sb, int i, int j) {
        char c = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, c);
    }

}