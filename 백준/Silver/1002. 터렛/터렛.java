import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      final int x1 = Integer.parseInt(st.nextToken());
      final int y1 = Integer.parseInt(st.nextToken());
      final int r1 = Integer.parseInt(st.nextToken());
      final int x2 = Integer.parseInt(st.nextToken());
      final int y2 = Integer.parseInt(st.nextToken());
      final int r2 = Integer.parseInt(st.nextToken());

      final long pdis = (long) (x1 - x2) * (x1 - x2) + (long) (y1 - y2) * (y1 - y2);
      long rdis = (long) (r1 + r2) * (r1 + r2);

      if (pdis > rdis) sb.append(0).append("\n");
      else if (pdis == rdis) sb.append(1).append("\n");
      else {
        rdis = (long) (r1 - r2) * (r1 - r2);
        if (pdis == rdis) {
          if (r1 == r2) sb.append(-1).append("\n");
          else sb.append(1).append("\n");
        }
        else if (pdis > rdis) sb.append(2).append("\n");
        else sb.append(0).append("\n");
      }
    }
    System.out.print(sb);
    br.close();
  }
}
