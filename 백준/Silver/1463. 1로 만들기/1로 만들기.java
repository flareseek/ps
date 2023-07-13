import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N + 1];
    for (int i = 2; i <= N; i++) {
      int c = A[i - 1];
      if (i % 6 == 0) A[i] = Integer.min(c, Integer.min(A[i / 2], A[i / 3])) + 1;
      else if (i % 2 == 0) A[i] = Integer.min(c, A[i / 2]) + 1;
      else if (i % 3 == 0) A[i] = Integer.min(c, A[i / 3]) + 1;
      else A[i] = c + 1;
    }
    System.out.println(A[N]);
    br.close();
  }
}