import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] field = new int[N];
    st = new StringTokenizer(br.readLine());
    field[0] = Integer.parseInt(st.nextToken());
    for(int i = 1; i < N; i++) field[i] = field[i-1] + Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();
    while(M-->0) {
       int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       int F = n[0] > 1 ? field[n[0]-2] : 0;
       sb.append(field[n[1]-1]-F).append("\n");
    }
    System.out.println(sb);
    br.close();
  }
}