import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int[][] A = new int[N][2];
    while(N-->0) A[N] = Stream.of(br.readLine().split( " ")).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(A, (a, b) -> b[1]==a[1] ? a[0]-b[0] : a[1]-b[1]);

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < A.length; i++) sb.append(A[i][0]).append(" ").append(A[i][1]).append("\n");
    System.out.println(sb);
    br.close();
  }
}