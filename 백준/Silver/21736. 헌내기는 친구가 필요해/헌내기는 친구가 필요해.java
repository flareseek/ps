import java.io.*;
import java.util.*;

class Main {
  static char[][] field;
  static int result = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    field = new char[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
    int[] start = new int[2];
    for(int r = 0; r < field.length; r++) {
      String str = br.readLine();
      for(int c = 0; c < field[0].length; c++) {
        char data = str.charAt(c);
        field[r][c] = data;
        if (data == 'I') start = new int[] {r, c};
      }
    }
    field[start[0]][start[1]] = 'X';
    DFS(start[0], start[1]);
    System.out.println(result == 0 ? "TT" : result);
    br.close();
  }
  public static void DFS(int row, int col) {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    for(int i = 0; i < dx.length; i++) {
      final int ROW = row + dy[i];
      final int COL = col + dx[i];
      if (COL < 0 || COL >= field[0].length || ROW < 0 || ROW >= field.length) continue;
      if (field[ROW][COL] == 'X') continue;
      if (field[ROW][COL] == 'P') result ++;
      field[ROW][COL] = 'X';
      DFS(ROW, COL);
    }
  }
}