import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    br.close();
    final int N = Integer.parseInt(st.nextToken());
    final int M = Integer.parseInt(st.nextToken());
    final int MOD = 1_000_000_007;
    long result1 = 1;
    long result2 = 1;

    for(int i = 0; i < N; i++) {
      result1 = (result1 * (M%MOD))%MOD;
      result2 = (result2 * ((M-1)%MOD))%MOD;
    }

    long result = (result1 - result2)%MOD;
    System.out.println(result >= 0 ? result : (result+MOD));
  }
}
