import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(st.nextToken());
    final int K = Integer.parseInt(st.nextToken());

    HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
    HashSet<String> set = new HashSet<>();
    for (int i = 0; i < K; i++) {
      String str = br.readLine();
      set.add(str);
    }

    for (String s: set) {
      st = new StringTokenizer(s);
      final int X = Integer.parseInt(st.nextToken());
      final int Y = Integer.parseInt(st.nextToken());

      int[] dx = {0, 2, 0, -2};
      int[] dy = {2, 0, -2, 0};

      for (int d = 0; d < dx.length; d++) {
        final int x = X + dx[d];
        final int y = Y + dy[d];
        if (x < 1 || x > N || y < 1 || y > N) continue;
        if (set.contains(String.format("%d %d", x, y))) continue;
        if (!map.containsKey(x)) map.put(x, new HashSet<>());
        map.get(x).add(y);
      }
    }
    int result = 0;
    for (int k : map.keySet())
      result += map.get(k).size();
    System.out.println(result);
    br.close();
  }
}
