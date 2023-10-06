import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) throws IOException {
    int[] score = { 9, 4, 8, 7, 2, 1, 6, 5, 0, 3 };
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int M = Integer.parseInt(st.nextToken());
    final int N = Integer.parseInt(st.nextToken());
    br.close();
    Integer[] numbers = new Integer[N-M+1];
    for(int i = M; i <= N; i++) numbers[i-M] = i;

    Arrays.sort(numbers, (a, b) -> {
      int Ascore = a/10 == 0 ? score[a%10]*10 : score[a/10] * 10 + score[a%10];
      int Bscore = b/10 == 0 ? score[b%10]*10 : score[b/10] * 10 + score[b%10];
      return Ascore - Bscore;
    });

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < numbers.length; i++) {
      sb.append(numbers[i]).append(" ");
      if ((i+1)%10 == 0) sb.append("\n");
    }
    System.out.println(sb);
  }
}