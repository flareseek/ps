import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static boolean[][] visited;
  static char[][] field;
  static int C, R, K;
  public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    C = Integer.parseInt(st.nextToken());
    R = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    field = new char[C][R];
    for(int c = 0; c < C; c++)
      field[c] = br.readLine().toCharArray();

    visited = new boolean[C][R];
    visited[C-1][0] = true;
    bt(C-1, 0, 1);
    System.out.println(count);
    br.close();
  }
  static int count = 0;
  static public void bt(int c, int r, int step) {
    if (step == K) {
      if (c == 0 && r == R-1) count ++;
      return;
    }
    
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    for (int i = 0; i < dx.length; i++) {
      final int x = r + dx[i];
      final int y = c + dy[i];

      if (x < 0 || x >= R || y < 0 || y >= C) continue;
      if (visited[y][x] || field[y][x] == 'T') continue;
      visited[y][x] = true;
      bt(y, x, step + 1);
      visited[y][x] = false;
    }
  }
}