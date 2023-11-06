import java.io.*;
import java.util.*;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();
    Arrays.sort(numbers);
    System.out.println(numbers[1]);
  }
}
