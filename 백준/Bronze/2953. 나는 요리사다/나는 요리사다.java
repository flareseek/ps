import java.io.*;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int index = 0;
    int max = 0;
    for(int i = 0; i < 5; i++) {
      int t = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
      if (max < t) {
        max = t;
        index = i+1;
      }
    }
    br.close();

    System.out.print(index + " " + max);
  }
}
