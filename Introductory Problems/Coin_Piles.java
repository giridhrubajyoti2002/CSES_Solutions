
import java.util.*;
import java.io.*;

public class Coin_Piles{
    
    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int tt = in.nextInt();

        while (tt-- != 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            int diff = max - min;
            if (diff <= min && (min - diff) % 3 == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
 
        out.flush();
    }

}