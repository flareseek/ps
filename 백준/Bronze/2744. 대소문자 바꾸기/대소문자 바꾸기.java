import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char s: str) {
            if ('a' <= s && s <= 'z') sb.append((char)(s-('a'-'A')));
            else sb.append((char)(s+('a'-'A')));
        }
        System.out.println(sb);
        br.close();
    }
}
