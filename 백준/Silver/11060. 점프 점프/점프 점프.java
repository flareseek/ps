import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] field = new int[N];
    for(int i = 0; i < N; i++)
      field[i] = Integer.parseInt(st.nextToken());
    br.close();

    if (N == 1) {
      System.out.println(0);
      return;
    }

    int[] step = new int[N];

    for(int i = 1; i <= field[0]; i++) step[i] ++;

    for(int i = 1; i < N; i++) {
      if (step[i] == 0) continue;
      for(int j = 1; j <= field[i]; j++) {
        if (i+j >= N) continue;
        if (i+j == N-1) {
          System.out.println(step[i]+1);
          return;
        }
        if (step[i+j] > step[i]+1 || step[i+j] == 0) step[i+j] = step[i]+1;
      }
    }
    System.out.println(-1);
  }
}
