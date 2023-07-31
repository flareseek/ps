import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int W = Integer.parseInt(st.nextToken());
    final int D = Integer.parseInt(st.nextToken());
    final int H = Integer.parseInt(st.nextToken());

    int[][][] box = new int[H][D][W];

    int goal = 0;
    Queue<int[]> q = new LinkedList<>(); // h, d, w
    for (int h = 0; h < H; h++) {
      for (int d = 0; d < D; d++) {
        st = new StringTokenizer(br.readLine());
        for (int w = 0; w < W; w++) {
          int t = Integer.parseInt(st.nextToken());
          box[h][d][w] = t;
          if (t == 0) goal++;
          else if (t == 1) q.add(new int[]{h, d, w});
        }
      }
    }
    br.close();

    if(goal == 0) {
      System.out.println(0);
      return;
    }

    final int[] dw = {1, 0, -1, 0, 0, 0}; // E, S, W, N, U, D
    final int[] dd = {0, 1, 0, -1, 0, 0};
    final int[] dh = {0, 0, 0, 0, 1, -1};

    int current = 0;
    int day = -1;
    while (!q.isEmpty()) {
      day ++;
      int size = q.size();
      for (int rp = 0; rp < size; rp++) {
        int[] P = q.poll();
        for (int i = 0; i < dw.length; i++) {
          int w = P[2] + dw[i], d = P[1] + dd[i], h = P[0] + dh[i];
          if (w < 0 || w >= W || d < 0 || d >= D || h < 0 || h >= H) continue;
          if (box[h][d][w] == 0) {
            current++;
            box[h][d][w] = -1;
            q.add(new int[]{h, d, w});
          }
        }
      }
    }
    System.out.println(goal == current ? day : "-1");
  }
}