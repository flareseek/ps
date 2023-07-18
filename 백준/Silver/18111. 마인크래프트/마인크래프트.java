import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[][] field = new int[N[0]][N[1]];
    int min = 256;
    int max = 0;

    for(int i = 0; i < N[0]; i++) {
      field[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for(int k = 0; k < N[1]; k++) {
        if(min > field[i][k]) min = field[i][k];
        if(max < field[i][k]) max = field[i][k];
      }
    }

    int time = -1;
    int top = min;
    for(int H = min; H <= max; H++) {
      int iv = N[2];
      int tt = 0;
      for(int[] F: field) {
        for(int f: F) {
          if(f > H) {
            iv += f-H;
            tt += (f-H)*2;
          } else if(f < H) {
            iv -= H-f;
            tt += (H-f);
          }
        }
      }
      if(iv < 0) continue;
      if(time >= tt || time == -1) {
        time = tt;
        top = H;
      }
    }
    System.out.println(new StringBuilder().append(time).append(" ").append(top));
    br.close();
  }
}