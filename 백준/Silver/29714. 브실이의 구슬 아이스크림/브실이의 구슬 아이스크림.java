import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    HashMap<String, Integer> map = new HashMap<>();

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++) {
      String str = st.nextToken();
      map.put(str, map.getOrDefault(str, 0) + 1);
    }

    final int Q = Integer.parseInt(br.readLine());
    for(int x = 0; x < Q; x++) {
      boolean is = false;
      st = new StringTokenizer(br.readLine());
      int q = Integer.parseInt(st.nextToken());
      HashMap<String, Integer> newMap = new HashMap<>();
      for (int z = 0; z < q; z++) {
        String key = st.nextToken();
        if (!map.containsKey(key)) {
          is = true;
          break;
        }
        newMap.put(key, newMap.getOrDefault(key, 0) + 1);
      }
      if (is) {
        br.readLine();
        continue;
      }
      for (String key: newMap.keySet()) {
        if (map.get(key) < newMap.get(key)) {
          is = true;
          break;
        }
      }
      if (is) {
        br.readLine();
        continue;
      }
      st = new StringTokenizer(br.readLine());
      q = Integer.parseInt(st.nextToken());
      for (int z = 0; z < q; z++) {
        String key = st.nextToken();
        newMap.put(key, newMap.getOrDefault(key, 0) - 1);
      }

      for (String key: newMap.keySet())
        map.put(key, map.getOrDefault(key, 0) - newMap.get(key));
    }
    StringBuilder sb = new StringBuilder();
    int result = 0;
    for (String key: map.keySet()) {
      int t = map.get(key);
      result += t;
      while(t-->0)
        sb.append(key).append(" ");
    }
    System.out.println(result);
    System.out.println(sb);
  }
}
