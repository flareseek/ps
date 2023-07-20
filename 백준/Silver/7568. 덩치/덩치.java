import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int[][] A = new int[N][2];

    while (N-- > 0) {
      int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      A[A.length - 1 - N][0] = n[0];
      A[A.length - 1 - N][1] = n[1];
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < A.length; i++) {
      int score = 1;
      for (int k = 0; k < A.length; k++) {
        if (i == k) continue;
        if (A[i][0] < A[k][0] && A[i][1] < A[k][1]) score++;
      }
      sb.append(score).append(" ");
    }
    System.out.println(sb);
    br.close();
  }
}