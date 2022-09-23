
import java.util.*;
import java.io.*;

public class Apartments {

    static InputReader in = new InputReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException{
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] des = new int[n];
        for (int i = 0; i < n; i++) {
            des[i] = in.nextInt();
        }
        int[] apar = new int[m];
        for (int i = 0; i < m; i++) {
            apar[i] = in.nextInt();
        }
        Arrays.sort(des);
        Arrays.sort(apar);

        int i = 0, j = 0;
        int cnt = 0;
        while (i < n && j < m) {
            if (apar[j] < des[i] - k) {
                j++;
            } else if (apar[j] > des[i] + k) {
                i++;
            } else {
                cnt++;
                i++;
                j++;
            }
        }
        out.println(cnt);

        out.flush();
    }

}

class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader() {
        this(System.in);
    }

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String next() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens())
            tokenizer = new StringTokenizer(reader.readLine());
        return tokenizer.nextToken();
    }

    public String nextLine() throws IOException {
        String line = null;
        tokenizer = null;
        line = reader.readLine();
        return line;
    }

    public Integer[] readIntArray(int n) throws IOException {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(next());
        }
        return arr;
    }
    public Long[] readLongArray(int n) throws IOException {
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(next());
        }
        return arr;
    }
    public String[] readStringArray(int n) throws IOException {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = next();
        }
        return arr;
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}
class Pair {
    int first, second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

