import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    HashMap<String, Integer> map = new HashMap<>();
    while(N[0]-->0) {
      String str = br.readLine();
      map.put(str, 1);
    }
    String[] S = new String[N[1]];
    while(N[1]-->0) S[S.length-1-N[1]] = br.readLine();
    Arrays.sort(S);

    StringBuilder sb = new StringBuilder();
    int cnt = 0;
    for(int i = 0; i < S.length; i++) {
      int t = map.getOrDefault(S[i], 0);
      if(t != 0) {
        sb.append(S[i]).append("\n");
        cnt ++;
      }
    }
    System.out.println(cnt);
    System.out.print(sb);
    br.close();
  }
}