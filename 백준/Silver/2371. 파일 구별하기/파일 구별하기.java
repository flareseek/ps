import java.util.*;
import java.io.*;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] data = new int[N][];

    while(N-->0)
      data[N] = Stream.of(br.readLine().replaceFirst(" -1", "").split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();

    while(true) {
      for(int k = 1; ; k++) {
        HashSet<String> set = new HashSet<>();
        boolean is = false;
        for(int[] D: data) {
          if (D.length < k) continue;
          StringBuilder sb = new StringBuilder();
          for(int i = 0; i < k; i++) {
            sb.append(D[i]).append(" ");
          }
          if (set.contains(sb.toString())) {
            is = true;
            break;
          }
          set.add(sb.toString());
        }
        if (!is) {
          System.out.println(k);
          return;
        }
      }
    }
  }
}