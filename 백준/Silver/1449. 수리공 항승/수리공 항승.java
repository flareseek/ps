import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(st.nextToken());
    final int L = Integer.parseInt(st.nextToken());

    int[] point = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();

    Arrays.sort(point);

    int prev = point[0];
    int l = L - 1;
    int tape = 1;
    for (int i = 1; i < N; i++) {
      l -= (point[i] - prev);
      if (l < 0) {
        tape++;
        l = L - 1;
      }
      prev = point[i];
    }
    System.out.println(tape);
  }
}