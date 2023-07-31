import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    char[][] C = new char[N][N];
    while (N-- > 0) C[C.length - 1 - N] = br.readLine().toCharArray();
    br.close();

    int g1 = 0;
    for (int col = 0; col < C.length; col++) {
      for (int row = 0; row < C[0].length; row++) {
        if (C[col][row] != 'R' && C[col][row] != 'G' && C[col][row] != 'B') continue;
        g1++;
        DFS(C, new int[]{col, row}, C[col][row], C[col][row] == 'B' ? 'b' : 'r');
      }
    }
    int g2 = 0;
    for (int col = 0; col < C.length; col++) {
      for (int row = 0; row < C[0].length; row++) {
        if (C[col][row] != 'r' && C[col][row] != 'b') continue;
        g2++;
        DFS(C, new int[]{col, row}, C[col][row], '0');
      }
    }

    StringBuilder sb = new StringBuilder();
    sb.append(g1).append(" ").append(g2);
    System.out.println(sb);
  }

  static void DFS(char[][] C, int[] index, char std, char re) {
    C[index[0]][index[1]] = re;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};
    for (int i = 0; i < dx.length; i++) {
      int r = index[1] + dx[i];
      int c = index[0] + dy[i];
      if (r < 0 || r >= C[0].length || c < 0 || c >= C.length) continue;
      if (C[c][r] == std) DFS(C, new int[]{c, r}, std, re);
    }
  }
}