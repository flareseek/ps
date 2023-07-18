import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();

    int t = N[2] - N[0];
    if(t <= 0) {
      System.out.println(1);
      return;
    }
    int cnt = 1;
    cnt += ((t-1)/(N[0]-N[1])+1);
    System.out.println(cnt);
  }
}