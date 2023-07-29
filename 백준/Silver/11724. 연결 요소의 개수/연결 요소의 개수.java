import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    boolean[][] graph = new boolean[N][N];
    boolean[] visited = new boolean[N];

    while(M-->0) {
      st = new StringTokenizer(br.readLine());
      int f = Integer.parseInt(st.nextToken());
      int t = Integer.parseInt(st.nextToken());
      graph[f-1][t-1] = graph[t-1][f-1] = true;
    }

    int cnt = 0;
    for(int i = 0; i < N; i++){
      if(visited[i]) continue;
      visited[i] = true;
      dfs(graph, visited, i);
      cnt ++;
    }
    System.out.println(cnt);
    br.close();
  }
  public static void dfs(boolean[][] graph, boolean[] visited, int index) {
    for(int i = 0; i < graph[index].length; i++) {
      if(!graph[index][i] || visited[i]) continue;
      visited[i] = true;
      dfs(graph, visited, i);
    }
  }
}