import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(st.nextToken());
    final int M = Integer.parseInt(st.nextToken());
    boolean[] visited = new boolean[N];
    int[] temp = new int[M];
    bt(temp, visited, 0);

    br.close();
  }
  public static void bt(int[] temp, boolean[] visited, int k) {
    if(k == temp.length) {
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < temp.length; i++) sb.append(temp[i]).append(" ");
      System.out.println(sb);
      return;
    }

    for(int i = 0; i < visited.length; i++) {
      if(visited[i]) continue;
      temp[k] = i+1;
      visited[i] = true;
      bt(temp, visited, k+1);
      visited[i] = false;
    }
  }
}