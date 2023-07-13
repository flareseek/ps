import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Map<Integer, Integer> map = new HashMap<>();

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    while(N-->0) {
      int t = Integer.parseInt(st.nextToken());
      map.put(t, map.getOrDefault(t, 0)+1);
    }

    N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    while(N-->0) {
      int t = Integer.parseInt(st.nextToken());
      bw.write(map.getOrDefault(t, 0) + " ");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}