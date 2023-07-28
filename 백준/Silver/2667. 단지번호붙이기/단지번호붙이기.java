import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] field = new int[N][N];
    while(N-->0) field[field.length-1-N] = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

    int[] dx = {0, 1, 0, -1}; // U, R, D, L
    int[] dy = {-1, 0, 1, 0};

    PriorityQueue <Integer> pr = new PriorityQueue<>();
    for(int col = 0; col < field.length; col++) {
      for(int row = 0; row < field.length; row++) {
        if(field[col][row] == 1) {
          int n = 1;
          Queue<int[]> q = new LinkedList<>();
          q.add(new int[]{col, row});
          field[col][row] = -1;
          while(!q.isEmpty()) {
            int[] P = q.poll();
            for(int i = 0; i < dx.length; i++) {
              int c = P[0] + dx[i];
              int r = P[1] + dy[i];
              if(c < 0 || c >= field.length || r < 0 || r >= field.length) continue;
              if(field[c][r] == 1) {
                n++;
                field[c][r] = -1;
                q.add(new int[]{c, r});
              }
            }
          }
          pr.add(n);
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    sb.append(pr.size()).append("\n");
    while(!pr.isEmpty()) sb.append(pr.poll()).append("\n");
    System.out.print(sb);
    br.close();
  }
}