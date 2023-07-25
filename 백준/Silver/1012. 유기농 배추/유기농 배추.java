import java.io.*;
import java.util.stream.Stream;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    while(N-->0) {
      int[] T = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[][] field = new int[T[1]][T[0]];
      while(T[2]-->0) {
        int[] t = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        field[t[1]][t[0]] = 1;
      }

      int worm = 0;
      for(int y = 0; y < field.length; y++) {
        for(int x = 0; x < field[0].length; x++) {
          if(field[y][x] == 1) {
            worm ++;
            dfs(field, x, y);
          }
        }
      }
      sb.append(worm).append("\n");
    }
    System.out.print(sb);
    br.close();
  }
  static void dfs(int[][]field, int x, int y) {
    int[] dx = {0, 1, 0 ,-1}; // U R D L
    int[] dy = {-1, 0, 1, 0};
    field[y][x] = -1;
    for(int i = 0; i < dx.length; i++) {
      int X = x + dx[i];
      int Y = y + dy[i];
      if((X>=0 && X<field[0].length && Y>=0 && Y<field.length) && field[Y][X] == 1) dfs(field, X, Y);
    }
  }
}