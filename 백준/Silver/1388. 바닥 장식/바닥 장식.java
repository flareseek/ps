import java.util.*;
import java.io.*;

class Main {
  static char[][] field;
  static int count;
  static int R;
  static int C;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    R = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());
    field = new char[R][C];

    for(int r = 0; r < R; r++) {
      String str = br.readLine();
      for(int c = 0; c < C; c++) {
        field[r][c] = str.charAt(c);
      }
    }
    for(int r = 0; r < R; r++) {
      for (int c = 0; c < C; c++) {
        if (field[r][c] == '-') {
          count ++;
          field[r][c] = '!';
          DFSR(r, c);
        } else if (field[r][c] == '|') {
          count ++;
          field[r][c] = '!';
          DFSD(r, c);
        }
      }
    }
    System.out.println(count);
    br.close();
  }
  static void DFSR(int r, int c) {
    c ++;
    if (c >= C) return;
    if (field[r][c] != '-') return;
    field[r][c] = '!';
    DFSR(r, c);
  }
  static void DFSD(int r, int c) {
    r ++;
    if (r >= R) return;
    if (field[r][c] != '|') return;
    field[r][c] = '!';
    DFSD(r, c);
  }
}