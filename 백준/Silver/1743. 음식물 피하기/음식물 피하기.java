import java.io.*;
import java.util.StringTokenizer;

class Main {
  static boolean[][] field;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int ROW = Integer.parseInt(st.nextToken());
    final int COL = Integer.parseInt(st.nextToken());
    int number = Integer.parseInt(st.nextToken());

    field = new boolean[ROW][COL];
    while (number-->0) {
      st = new StringTokenizer(br.readLine());
      final int r = Integer.parseInt(st.nextToken()) -1;
      final int c = Integer.parseInt(st.nextToken()) -1;
      field[r][c] = true;
    }
    br.close();

    int max = 0;
    for(int r = 0; r < ROW; r++) {
      for(int c = 0; c < COL; c++) {
        if (field[r][c]) {
          int t = DFS(r, c);
          if (max < t) max = t;
        }
      }
    }
    System.out.println(max);
  }

  public static int DFS(int row, int col) {
    field[row][col] = false;
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    int step = 1;
    for(int i = 0; i < dx.length; i++) {
      int ROW = row + dy[i];
      int COL = col + dx[i];
      if (ROW < 0 || ROW >= field.length || COL < 0 || COL >= field[0].length) continue;
      if (!field[ROW][COL]) continue;
      step += DFS(ROW, COL);
    }
    return step;
  }

}
