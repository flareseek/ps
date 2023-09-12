import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int A = Integer.parseInt(st.nextToken());
    final int B = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine()) ;
    final int K = Integer.parseInt(st.nextToken());
    final int X = Integer.parseInt(st.nextToken());
    br.close();

    final int C = K - X;
    final int D = K + X;

    int f = C < A ? A : C, s = B < D ? B : D;
    System.out.println(s - f >= 0 ? s - f + 1 : "IMPOSSIBLE");
  }
}
