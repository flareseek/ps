import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] points = new int[N];
    for(int i = 0; i < N; i++)
      points[i] = Integer.parseInt(st.nextToken());
    Arrays.sort(points);

    System.out.println(points[(points.length/2 + points.length%2)-1]);
    br.close();
  }
}