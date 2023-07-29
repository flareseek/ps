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

    HashSet<Integer> set = new HashSet<>();
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{f, 0});
    while (!q.isEmpty()) {
      int[] p = q.poll();
      if (p[0] < 0 || set.contains(p[0])) continue;
      if (p[0] == t) {
        System.out.println(p[1]);
        return;
      }
      set.add(p[0]);
      if(p[0] > t) q.add(new int[]{p[0] - 1, p[1] + 1});
      else {
        q.add(new int[]{p[0] - 1, p[1] + 1});
        q.add(new int[]{p[0] + 1, p[1] + 1});
        q.add(new int[]{p[0] * 2, p[1] + 1});
      }
    }
  }
}