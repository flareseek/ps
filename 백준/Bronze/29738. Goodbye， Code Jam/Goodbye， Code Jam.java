import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int[] ROUND = { 4500, 1000, 25, 0 };
    final int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= N; i++) {
      sb.append("Case #").append(i).append(": ");

      final int n = Integer.parseInt(br.readLine());
      for(int j = 0; j < ROUND.length; j++) {
        if (n > ROUND[j]) {
          if (j == ROUND.length-1) sb.append("World Finals").append("\n");
          else sb.append("Round ").append(j+1).append("\n");
          break;
        }
      }
    }
    System.out.print(sb);
    br.close();
  }
}
