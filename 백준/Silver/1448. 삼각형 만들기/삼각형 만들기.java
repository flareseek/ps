import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    int[] lens = new int[N];
    for(int i = 0; i < N; i++)
      lens[i] = Integer.parseInt(br.readLine());
    br.close();

    Arrays.sort(lens);

    for (int i = lens.length - 1; i >= 2; i--) {
      if (lens[i] < lens[i-1] + lens[i-2]) {
        System.out.println(lens[i] + lens[i-1] + lens[i-2]);
        return;
      }
    }
    System.out.println(-1);
  }
}
