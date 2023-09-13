import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(st.nextToken());
    final int M = Integer.parseInt(st.nextToken());
    final int K = Integer.parseInt(st.nextToken());
    br.close();

    int min = N - (M*K);
    int max = min + (M-1);

    StringBuilder sb = new StringBuilder();
    sb.append(Math.max(min, 0)).append(" ").append(Math.max(max, 0));
    System.out.println(sb);
  }
}
