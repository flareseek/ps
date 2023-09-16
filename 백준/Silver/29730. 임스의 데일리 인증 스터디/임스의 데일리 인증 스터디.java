import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    String[] S = new String[N];
    for(int i = 0; i < N; i++)
      S[i] = br.readLine();
    br.close();

    Arrays.sort(S, (a, b) -> {
      final boolean isABoj = a.startsWith("boj.kr/");
      final boolean isBBoj = b.startsWith("boj.kr/");

      if (isABoj ^ isBBoj) {
        return isABoj ? 1 : -1;
      }
      else if (isABoj && isBBoj) {
        final int aNumber = Integer.parseInt(a.substring(a.lastIndexOf("/")+1));
        final int bNumber = Integer.parseInt(b.substring(b.lastIndexOf("/")+1));
        return aNumber - bNumber;
      }
      else if (a.length() == b.length()) {
        return a.compareTo(b);
      }
      return a.length() - b.length();
    });

    StringBuilder sb = new StringBuilder();
    for (String s: S) sb.append(s).append("\n");
    System.out.print(sb);
  }
}
