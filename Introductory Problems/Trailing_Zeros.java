
import java.util.*;
import java.io.*;

public class Trailing_Zeros{
    
    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int n = in.nextInt();
        int cnt = 0;
        for (int i = 1; i <= Math.log(n) / Math.log(5); i++) {
            int x = (int) Math.pow(5, i);
            cnt += n / x;
        }
 
        out.println(cnt);
 
        out.flush();
    }

}