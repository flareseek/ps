import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N + 3];
    A[3] = 1;
    A[5] = 1;
    for (int i = 3; i <= N - 3; i++) {
      if (A[i] == 0) continue;

      int t = A[i] + 1;
      if (A[i + 3] == 0) A[i + 3] = t;
      else A[i + 3] = Integer.min(A[i + 3], t);

      if (A[i + 5] == 0) A[i + 5] = t;
      else A[i + 5] = Integer.min(A[i + 5], t);
    }
    System.out.println(A[N] == 0 ? "-1" : A[N]);
    br.close();
  }
}