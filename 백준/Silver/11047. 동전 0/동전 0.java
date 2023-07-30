import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] coins = new int[N[0]];
    while(N[0]-->0) coins[N[0]] = Integer.parseInt(br.readLine());
    int sum = 0;
    for(int c: coins) {
      sum += N[1] / c;
      N[1] %= c;
    }
    System.out.println(sum);
    br.close();
  }
}