import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] C = br.readLine().toCharArray();
        Arrays.sort(C);
        System.out.println(new StringBuilder(new String(C)).reverse());
        br.close();
    }
}
