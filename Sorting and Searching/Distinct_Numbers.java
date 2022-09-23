// Problem: Distinct Numbers
// Contest: CSES - CSES Problem Set
// URL: https://cses.fi/problemset/task/1621
// Memory Limit: 512 MB
// Time Limit: 1000 ms
 
import java.io.*;
import java.util.*;
 
public class Distinct_Numbers {
 
    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
 
    public static void main(String[] args) throws Exception {
        int n = in.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(in.nextInt());
        }
 
        out.println(set.size());
        out.flush();
    }
}