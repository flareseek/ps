import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static int N;
  static int M;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    int[] temp = new int [M];
    backtracking(temp, 1, 0);
    br.close();
  }
  public static void backtracking(int[] temp, int index, int current) {
    if(current == M) {
      StringBuilder sb = new StringBuilder();
      for(int t: temp) sb.append(t).append(" ");
      System.out.println(sb);
      return;
    }
    for(int i = index; i <= N; i++) {
      temp[current] = i;
      backtracking(temp, i+1, current+1);
    }
  }
}