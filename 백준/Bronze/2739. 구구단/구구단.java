import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 9; i++) sb.append(String.format("%d * %d = %d\n", N, i, N*i));
        System.out.print(sb);
    }
}