import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] sc = new int[N][2];
    while(N-->0) sc[N]= Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(sc, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
    int cnt = 0;
    int last = 0;
    for(int[] i: sc) {
      if(last > i[0]) continue;
      cnt ++;
      last = i[1];
    }
    System.out.println(cnt);
    br.close();
  }
}