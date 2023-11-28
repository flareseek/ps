import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();

    Arrays.sort(n);
    StringBuilder sb = new StringBuilder();
    for(int N: n) sb.append(N).append(" ");

    System.out.println(sb);
  }
}
