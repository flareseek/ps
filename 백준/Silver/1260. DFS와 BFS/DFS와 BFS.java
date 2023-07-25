import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    boolean[][] graph = new boolean[N[0] + 1][N[0] + 1];
    while (N[1]-- > 0) {
      int[] t = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      graph[t[0]][t[1]] = true;
      graph[t[1]][t[0]] = true;
    }
    StringBuilder sb = new StringBuilder();
    boolean[] his = new boolean[N[0] + 1];
    DFS(graph, his, N[2], sb);
    sb.append("\n");
    BFS(graph, N[2], sb);

    System.out.print(sb);
    br.close();
  }

  static void DFS(boolean[][] graph, boolean[] history, int number, StringBuilder sb) {
    sb.append(number).append(" ");
    history[number] = true;
    for (int i = 1; i < graph.length; i++) {
      if (i == number) continue;
      if (graph[number][i] && !history[i]) DFS(graph, history, i, sb);
    }
  }

  static void BFS(boolean[][] graph, int number, StringBuilder sb) {
    boolean[] history = new boolean[graph.length+1];
    Queue<Integer> q = new LinkedList<>();
    history[number] = true;
    sb.append(number).append(" ");
    q.add(number);
    while(!q.isEmpty()) {
      number = q.poll();
      for(int i = 1; i < graph.length; i++) {
        if(number == i) continue;
        if(graph[number][i] && !history[i]) {
          sb.append(i).append(" ");
          q.add(i);
          history[i] = true;
        }
      }
    }
  }
}