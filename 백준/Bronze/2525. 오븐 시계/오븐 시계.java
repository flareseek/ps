import java.io.*;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] T = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    final int m = Integer.parseInt(br.readLine());
    br.close();
    T[1] += m;
    System.out.println((T[0]+T[1]/60)%24 + " " + T[1]%60);
  }
}
