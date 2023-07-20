import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    if(N == 0) {
      System.out.println(0);
      br.close();
      return;
    }

    int sum = 0;
    int[] A = new int[31];
    for(int i = 0; i < N; i++) {
      int t = Integer.parseInt(br.readLine());
      A[t] ++;
      sum += t;
    }
    int e = (int)Math.round(N * 0.15);
    int f = e, r = e;
    for(int i = 0; i < A.length; i++) {
      if(A[i] != 0 && f > 0) {
        int m = Math.min(A[i], f);
        f -= m;
        sum -= i*m;
      }
      if(A[A.length-1-i] != 0 && r > 0) {
        int m = Math.min(A[A.length-1-i], r);
        r -= m;
        sum -= (A.length-1-i)*m;
      }
      if(f == 0 && r == 0) break;
    }
    System.out.println((int)Math.round((double)sum/(N-e*2)));
    br.close();
  }
}