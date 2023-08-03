import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    int bus = Integer.parseInt(br.readLine());
    int[][] graph = new int[N + 1][N + 1];
    int[][] nxt = new int[N + 1][N + 1];
    while (bus-- > 0) {
      int[] T = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if (graph[T[0]][T[1]] == 0 || graph[T[0]][T[1]] > T[2]) {
        graph[T[0]][T[1]] = T[2];
        nxt[T[0]][T[1]] = T[1];
      }
    }
    for (int bridge = 1; bridge <= N; bridge++) {
      for (int start = 1; start <= N; start++) {
        for (int goal = 1; goal <= N; goal++) {
          if (start == goal || bridge == start || bridge == goal) continue;
          if (graph[start][bridge] == 0 || graph[bridge][goal] == 0) continue;
          int distance = graph[start][bridge] + graph[bridge][goal];
          if (graph[start][goal] == 0 || graph[start][goal] > distance) {
            graph[start][goal] = distance;
            nxt[start][goal] = nxt[start][bridge]; // 루트에서 브릿지로 가는 최초의 경로
          }
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    for(int col = 1; col <= N; col ++) {
      for(int row = 1; row <= N; row ++) sb.append(graph[col][row]).append(" ");
      sb.append("\n");
    }
    for (int root = 1; root <= N; root++) {
      for (int goal = 1; goal <= N; goal++) {
        if (graph[root][goal] == 0) {
          sb.append(0).append("\n");
          continue;
        }
        int step = 0;
        int chase = root;
        StringBuilder sbt = new StringBuilder();
        while(chase != goal) {
          sbt.append(chase).append(" ");
          chase = nxt[chase][goal];
          step ++;
        }
        sbt.append(chase);
        sb.append(step+1).append(" ").append(sbt).append("\n");
      }
    }
    System.out.print(sb);
    br.close();
  }
}