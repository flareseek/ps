import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    if(N[0] < N[1]) {
      int t = N[0];
      N[0] = N[1];
      N[1] = t;
    }
    int A = N[0];
    int B = N[1];
    while(B != 0) {
      int t = B;
      B = A%B;
      A = t;
    }
    System.out.println(A);
    System.out.println(N[0]*N[1]/A);
    br.close();
  }
}