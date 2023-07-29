import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    boolean[] visited = new boolean[N+1];
    ArrayList<LinkedList<Integer>> cnn = new ArrayList<>(N+1);
    for(int i = 0; i <= N; i++) cnn.add(i, new LinkedList<Integer>());

    for(int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int f = Integer.parseInt(st.nextToken());
      int t = Integer.parseInt(st.nextToken());
      cnn.get(f).add(t);
      cnn.get(t).add(f);
    }
    int cnt = 0;
    for(int i = 1; i <= N; i++) {
      if(visited[i]) continue;
      cnt ++;
      Queue<Integer> q = new LinkedList<>();
      q.add(i);
      visited[i] = true;
      while(!q.isEmpty()) {
        int p = q.poll();
        LinkedList<Integer> l = cnn.get(p);
        for(int j: l) {
          if(visited[j]) continue;
          visited[j] = true;
          q.add(j);
        }
      }
    }
    System.out.println(cnt);
    br.close();
  }
}