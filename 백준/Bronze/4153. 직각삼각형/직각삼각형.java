import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while(true) {
      int N[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if(N[0] == 0) break;
      Arrays.sort(N);
      bw.write((N[0]*N[0] + N[1]*N[1]) == (N[2]*N[2]) ? "right\n" : "wrong\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}