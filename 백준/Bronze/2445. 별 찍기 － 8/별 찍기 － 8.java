import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        for(int n = 0; n < N-1; n++) {
            StringBuilder s = new StringBuilder();
            for(int i = 0; i <= n; i++) s.append("*");
            for(int i = 0; i < N-n-1; i++) s.append(" ");
            sb.append(s).append(s.reverse()).append("\n");
        }
        StringBuilder s = new StringBuilder();
        s.append(sb);
        for(int i = 0; i < 2 * N; i++) s.append("*");
        s.append(sb.reverse());
        System.out.println(s);
    }
}