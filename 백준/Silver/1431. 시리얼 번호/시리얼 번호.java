import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    String[] S = new String[N];
    for (int i = 0; i < N; i++)
      S[i] = br.readLine();

    Arrays.sort(S, (a, b) -> {
      if (a.length() != b.length()) return a.length() - b.length();
      else {
        final int sLen = a.length();
        int an = 0, bn = 0;
        for(int i = 0; i < sLen; i++) {
          if ('1' <= a.charAt(i) && a.charAt(i) <= '9') an += a.charAt(i) - '0';
          if ('1' <= b.charAt(i) && b.charAt(i) <= '9') bn += b.charAt(i) - '0';
        }
        if (an == bn) return a.compareTo(b);
        else return an - bn;
      }
    });

    StringBuilder sb = new StringBuilder();
    for(String s: S) sb.append(s).append("\n");
    System.out.print(sb);
    br.close();
  }
}
