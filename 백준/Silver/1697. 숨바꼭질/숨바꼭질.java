import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int f = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(st.nextToken());
    br.close();
    if (f >= t) {
      System.out.println(f - t);
      return;
    }
    boolean[] visited = new boolean[100001];
    Queue<Integer> q = new LinkedList<>();
    q.add(f);
    int cnt = -1;
    while(true) {
      cnt ++;
      int s = q.size();
      for(int i = 0; i < s; i++) {
        int p = q.poll();
        if(visited[p]) continue;
        visited[p] = true;
        if(p == t) {
          System.out.println(cnt);
          return;
        }
        int r = p+1, l = p-1, d = p*2;
        if(l >= 0) q.add(l);
        if(p < t) {
          if(r <= 100000) q.add(r);
          if(d <= 100000) q.add(d);
        }
      }
    }
  }
}