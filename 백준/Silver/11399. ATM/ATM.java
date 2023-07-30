import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();
    Arrays.sort(N);
    int sum = 0;
    for(int i = 0; i < T; i++) sum += N[i] * (T - i);
    System.out.println(sum);
  }
}