import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(st.nextToken());
    final int M = Integer.parseInt(st.nextToken());
    ArrayList<ArrayList<Integer>> list = new ArrayList<>(N+1);
    for (int i = 0; i <= N; i++)
      list.add(i, new ArrayList<>());

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      list.get(B).add(A);
    }
    br.close();

    int count = 0;
    int max = 0;
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i <= N; i++) {
      Queue<Integer> q = new LinkedList<>();
      boolean[] visited = new boolean[N+1];
      q.add(i);
      visited[i] = true;

      count = 0;
      while(!q.isEmpty()) {
        final int P = q.poll();
        for(int p: list.get(P)) {
          if (visited[p]) continue;
          visited[p] = true;
          count ++;
          q.add(p);
        }
      }
      if (max < count) {
        sb.setLength(0);
        sb.append(i).append(" ");
        max = count;
      } else if (max == count) sb.append(i).append(" ");
    }
    System.out.println(sb);
  }
}