import java.io.*;
import java.util.Arrays;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[][] array = new int[8][2];
    for(int i = 1; i <= 8; i++) {
      int score = Integer.parseInt(br.readLine());
      array[i-1] = new int[] {score, i};
    }
    br.close();

    Arrays.sort(array, (a, b) ->  a[0] - b[0]);
    StringBuilder sb = new StringBuilder();
    int[] index = new int[5];
    int t = 0;
    int total = 0;
    for(int i = 3; i <= 7; i++) {
      index[t++] = array[i][1];
      total += array[i][0];
    }
    Arrays.sort(index);
    sb.append(total).append("\n");
    for(int i: index) sb.append(i).append(" ");
    System.out.println(sb);
  }
}
