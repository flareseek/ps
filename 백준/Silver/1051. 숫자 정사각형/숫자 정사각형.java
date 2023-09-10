import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(st.nextToken());
    final int M = Integer.parseInt(st.nextToken());

    final int[][] field = new int[N][M];

    for (int i = 0; i < N; i++)
      field[i] = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

    int max = 1;
    for (int c = 0; c < N - 1; c++) {
      for (int r = 0; r < M - 1; r++) {
        final int number = field[c][r];

        for (int i = 1; (c+i) < N && (r+i) < M; i++) {
          if (field[c+i][r+i] == number && field[c][r+i] == number && field[c+i][r] == number && max < i+1) max = i+1;
        }
      }
    }
    System.out.println(max*max);
    br.close();
  }
}
