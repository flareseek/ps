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
      for (int j = i-1; j >= 1; j--) {
        if (lens[j] * 2 <= lens[i]) break;
        for (int k = j - 1; k >= 0; k--) {
          if (lens[i] < lens[j] + lens[k]) {
            System.out.println((lens[i] + lens[j] + lens[k]));
            return;
          }
        }
      }
    }
    System.out.println(-1);
  }
}
