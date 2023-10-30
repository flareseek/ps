import java.io.*;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();

    while(true) {
      if (N[0] == N[2]) break;
      if (N[0] < N[2]) N[0] += 15;
      else N[2] += 19;
    }

    while(true) {
      if (N[0] == N[1]) break;
      if (N[0] < N[1]) N[0] += 285;
      else N[1] += 28;
    }
    System.out.println(N[1]);
  }
}