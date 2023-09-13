import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] date = Stream.of(br.readLine().split("-")).mapToInt(Integer::parseInt).toArray();
    int increment = Integer.parseInt(br.readLine());

    date[2] += increment;
    int t = (date[2]-1) / 30;
    date[2] -= t*30;

    date[1] += t;
    t = (date[1]-1)/12;
    date[1] -= t*12;

    date[0] += t;

    StringBuilder sb = new StringBuilder();
    System.out.println(sb.append(date[0]).append("-").append(String.format("%02d", date[1])).append("-").append(String.format("%02d", date[2])));
    br.close();
  }
}
