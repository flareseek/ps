import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    ArrayList<LinkedList<Integer>> graph = new ArrayList<>(N+1);
    for(int i = 0; i <= N; i++) graph.add(i, new LinkedList<Integer>());

    for(int i = 0; i < N-1; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int f = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
      graph.get(f).add(t);
      graph.get(t).add(f);
    }
    int[] visited = new int[N+1];
    visited[1] = -1;
    DFS(graph, visited, 1);

    StringBuilder sb = new StringBuilder();
    for(int i = 2; i < visited.length; i++) sb.append(visited[i]).append("\n");
    System.out.print(sb);
    br.close();
  }
  static void DFS(ArrayList<LinkedList<Integer>> graph, int[] visited, int index) {
    for(int g: graph.get(index)) {
      if(visited[g] != 0) continue;
      visited[g] = index;
      DFS(graph, visited, g);
    }
  }
}