
import java.util.*;
import java.io.*;

public class Apple_Division{
    
    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int n = in.nextInt();
        Long[] arr = new Long[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextLong();
        }
        // out.println(Math.abs(sum1 - sum2));
        out.println(f(arr, n - 1, 0, 0));
 
        out.flush();
    }
    static long f(Long[] arr, int i, long sum1, long sum2) {
        if (i < 0) {
            return Math.abs(sum1 - sum2);
        }
        return Math.min(f(arr, i - 1, sum1 + arr[i], sum2), f(arr, i - 1, sum1, sum2 + arr[i]));
    }

}