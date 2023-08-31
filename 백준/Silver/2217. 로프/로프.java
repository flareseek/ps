import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    int[] numbers = new int[N];
    for (int i = 0; i < N; i++) numbers[i] = Integer.parseInt(br.readLine());
    br.close();

    Arrays.sort(numbers);

    int max = 0;
    for(int i = N-1; i >= 0; i--) {
      int t = numbers[i] * (N-i);
      if (t > max) max = t;
    }
    System.out.println(max);
  }
}