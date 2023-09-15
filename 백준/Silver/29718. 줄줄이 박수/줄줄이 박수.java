import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int C = Integer.parseInt(st.nextToken());
    final int R = Integer.parseInt(st.nextToken());

    int[][] field =  new int[C][R];
    for(int i = 0; i < C; i++)
      field[i] = Stream.of(br.readLine().split(" ")) .mapToInt(Integer::parseInt).toArray();
    final int compare = Integer.parseInt(br.readLine());
    br.close();

    int max = 0;
    for (int c = 0; c < C; c++)
      for (int r = 0; r < compare; r++)
        max += field[c][r];


    int last = max;
    for (int r = compare; r < R; r++) {
      for (int c = 0; c < C; c++) {
        last += field[c][r];
        last -= field[c][r-compare];
      }
      if (last > max) max = last;
    }
    System.out.println(max);
  }
}
