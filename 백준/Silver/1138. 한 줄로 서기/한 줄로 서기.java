import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] NN = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();

    List<Integer> list = new ArrayList<>();

    while(N-->0) {
      if(NN[N] == 0) list.add(0, N+1);
      else list.add(NN[N], N+1);
    }

    StringBuilder sb = new StringBuilder();
    for(int l: list) sb.append(l).append(" ");

    System.out.println(sb);
  }
}