import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int C = Integer.parseInt(st.nextToken());
    final int R = Integer.parseInt(st.nextToken());
    final int H = Integer.parseInt(st.nextToken());

    char [][][] cube = new char[H][C][R];

    //bomb -1
    for(int h = 0; h < H; h++) {
      for(int c = 0; c < C; c++) {
        String input = br.readLine();
        for(int r = 0; r < R; r++) {
          cube[h][c][r] = input.charAt(r);
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for(int h = 0; h < H; h++) {
      for(int c = 0; c < C; c++) {
        for(int r = 0; r < R; r++) {
          if (cube[h][c][r] == '*') {
            sb.append("*");
            continue;
          }

          int bomb = 0;
          int[] dz = {-1, 0, 1};
          int[] dy = {-1, 0, 1};
          int[] dx = {-1, 0, 1};

          for(int z = 0; z < dz.length; z++){
            for(int y = 0; y < dy.length; y++) {
              for (int x = 0; x < dx.length; x++) {
                int dh = h+dz[z];
                int dc = c+dy[y];
                int dr = r+dx[x];
                if (dh < 0 || dh >= H || dc < 0 || dc >= C || dr < 0 || dr >= R) continue;
                if (cube[dh][dc][dr] == '*') bomb ++;
              }
            }
          }
          sb.append(bomb%10);
        }
        sb.append("\n");
      }
    }
    System.out.print(sb);

    br.close();
  }
}