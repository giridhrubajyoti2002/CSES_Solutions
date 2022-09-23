
import java.util.*;
import java.io.*;

public class Chessboard_and_Queens{
    
    static Scanner in = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int n = 8;
        char[][] arr = new char[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = in.next().toCharArray();
        }
        int ans = recur(arr, 0);
        out.println(ans);
        out.flush();
    }
    static int recur(char[][] arr, int x) {
        if (x >= arr.length) {
            return 1;
        }
        int ans = 0;
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[x][j] == '.' && check(arr, x, j)) {
                char ch = arr[x][j];
                arr[x][j] = 'Q';
                ans += recur(arr, x + 1);
                arr[x][j] = ch;
            }
        }
        return ans;
    }
    static boolean check(char[][] arr, int x, int y) {
        for (int i = x - 1; i >= 0; i--) {
            if (arr[i][y] == 'Q') {
                return false;
            }
        }
        for (int j = y - 1; j >= 0; j--) {
            if (arr[x][j] == 'Q') {
                return false;
            }
        }
        int i = x - 1, j = y - 1;
        while (i >= 0 && j >= 0) {
            if (arr[i--][j--] == 'Q') {
                return false;
            }
        }
        i = x - 1;
        j = y + 1;
        while (i >= 0 && j < arr.length) {
            if (arr[i--][j++] == 'Q') {
                return false;
            }
        }
        return true;
    }

}