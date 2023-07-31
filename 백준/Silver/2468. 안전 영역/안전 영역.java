import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    int[][] field = new int[N][N];
    for(int i = 0; i < N; i++) field[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    int group = 0;
    for(int top = 0; top <= 100; top ++){
      int temp = 0;
      boolean[][] visited = new boolean[N][N];
      for(int col = 0; col < N; col++) {
        for(int row = 0; row < N; row++) {
          if(field[col][row] > top && !visited[col][row]) {
            visited[col][row] = true;
            DFS(field, visited, col, row, top);
            temp ++;
          }
        }
      }
      if(temp == 0) break;
      if(group < temp)  group = temp;
    }
    System.out.println(group);
    br.close();
  }
  static void DFS(int[][] field, boolean[][] visited, int col, int row, int top) {
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, -1, 0, 1};

    for(int i = 0; i < dx.length; i++) {
      int c = col + dy[i], r = row + dx[i];
      if (c < 0 || c >= field.length || r < 0 || r >= field[0].length) continue;
      if(field[c][r] <= top || visited[c][r]) continue;
      visited[c][r] = true;
      DFS(field, visited, c, r, top);
    }
  }
}