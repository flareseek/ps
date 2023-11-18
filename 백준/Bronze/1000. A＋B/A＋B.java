import java.io.*;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum());
    br.close();
  }
}
