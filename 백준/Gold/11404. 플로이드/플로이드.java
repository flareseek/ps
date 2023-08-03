import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    int bus = Integer.parseInt(br.readLine());

    int[][] graph = new int[N][N];
    while (bus-- > 0) {
      int[] t = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if(graph[t[0] - 1][t[1] - 1] == 0 || graph[t[0] - 1][t[1] - 1] > t[2]) graph[t[0]-1][t[1]-1] = t[2];
    }

    for (int b = 0; b < N; b++) {
      for (int s = 0; s < N; s++) {
        for (int e = 0; e < N; e++) {
          if (s == e) continue;
          if (s == b || e == b) continue;
          if (graph[s][b] == 0 || graph[b][e] == 0) continue;
          int t = graph[s][b] + graph[b][e];
          if ((graph[s][e] == 0) || (graph[s][e] > t)) graph[s][e] = t;
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int[] C : graph) {
      for (int R : C) sb.append(R).append(" ");
      sb.append("\n");
    }
    System.out.print(sb);
    br.close();
  }
}