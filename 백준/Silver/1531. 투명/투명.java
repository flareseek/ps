import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    final int N = Integer.parseInt(st.nextToken());
    final int M = Integer.parseInt(st.nextToken());

    int[][] field = new int[101][101];

    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      final int x1 = Integer.parseInt(st.nextToken());
      final int y1 = Integer.parseInt(st.nextToken());
      final int x2 = Integer.parseInt(st.nextToken());
      final int y2 = Integer.parseInt(st.nextToken());

      for(int x = x1; x <= x2; x++) {
        for (int y = y1; y <= y2; y++) {
          field[x][y] ++;
        }
      }
    }

    int result = 0;
    for(int[] F: field) {
      for(int f: F) {
        if (f > M) result ++;
      }
    }

    System.out.println(result);
    br.close();
  }
}