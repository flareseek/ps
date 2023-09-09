import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < N; i++) {
      final int[] P = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      final int n = Integer.parseInt(br.readLine());
      int count = 0;
      for(int j = 0; j < n; j++) {
        final int[] p = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean r1 = ((P[0]-p[0])*(P[0]-p[0]) + (P[1]-p[1])*(P[1]-p[1])) < (p[2] * p[2]);
        boolean r2 = ((P[2]-p[0])*(P[2]-p[0]) + (P[3]-p[1])*(P[3]-p[1])) < (p[2] * p[2]);
        if (r1 ^ r2) count ++;
      }
      sb.append(count).append("\n");
    }
    System.out.print(sb);
    br.close();
  }
}
