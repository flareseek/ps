import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[]s = Stream.of(st.nextToken().split(":")).mapToInt(Integer::parseInt).toArray();
    int[]e = Stream.of(st.nextToken().split(":")).mapToInt(Integer::parseInt).toArray();
    st = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(st.nextToken());
    final int M = Integer.parseInt(st.nextToken());
    br.close();

    int[] c = {s[0], s[1]};
    int d = 0;
    for(int i = 0; i < N+1; i++) {
      c[0] += (c[1]+M)/60;
      c[1] = (c[1]+M)%60;
      if ((c[0] == e[0] && c[1] >= e[1]) || (c[0] > e[0])) {
        d ++;
        c[0] = s[0] + ((s[1] + M) / 60);
        c[1] = ((s[1] + M) % 60);
      }
    }
    StringBuilder sb = new StringBuilder();
    sb.append(d).append("\n").append(String.format("%02d",c[0])).append(":").append(String.format("%02d",c[1]));
    System.out.println(sb);
  }
}