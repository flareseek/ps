import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    int[][] field = new int[N][N];
    for(int i = 0; i < N; i++) field[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    for(int b = 0; b < N; b++)
      for(int s = 0; s < N; s++)
        for(int g = 0; g < N; g++)
          if(field[s][b] != 0 && field[b][g] != 0) field[s][g] = 1;

    StringBuilder sb = new StringBuilder();
    for(int[] F: field) {
      for(int f: F) sb.append(f).append(" ");
      sb.append("\n");
    }
    System.out.print(sb);
    br.close();
  }
}