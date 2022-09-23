
import java.util.*;
import java.io.*;

public class Bit_Strings{
    
    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        long MOD = (long) 1e9 + 7;
        int n = in.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * 2) % MOD;
        }
        out.println(ans);
 
        out.flush();
    }

}