
import java.util.*;
import java.io.*;

public class Tower_of_Hanoi{
    
    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int n = in.nextInt();
        ArrayList<Integer[]> list = new ArrayList<>();
        f(list, n, 1, 3, 2);
        out.println(list.size());
        for (Integer[] arr : list) {
            out.println(arr[0] + " " + arr[1]);
        }
        out.flush();
    }
    static void f(ArrayList<Integer[]> list, int n, int src, int dest, int help) {
        if (n == 0) return;
        f(list, n - 1, src, help, dest);
        list.add(new Integer[] {src, dest});
        f(list, n - 1, help, dest, src);
    }

}