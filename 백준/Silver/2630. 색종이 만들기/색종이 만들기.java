import java.io.*;
import java.util.stream.Stream;

public class Main {
  static int white = 0;
  static int blue = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    int[][] field = new int[N][N];
    for(int i = 0;  i < N; i++) field[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    check(field, 0, N, 0, N, N);
    System.out.println(white);
    System.out.println(blue);
    br.close();
  }

  public static void dnq(int[][] field, int startCol, int startRow, int size) {
    // 2사분면
    check(field, startCol, startCol+size, startRow ,startRow+size, size);
    // 1사분면
    check(field, startCol, startCol+size, startRow+size, startRow+2*size, size);
    //3사분면
    check(field, startCol+size, startCol+2*size, startRow, startRow+size, size);
    //4사분면
    check(field, startCol+size, startCol+2*size, startRow+size, startRow+2*size, size);
  }
  public static void check(int[][] field, int startCol, int endCol, int startRow, int endRow, int size) {
    int last = field[startCol][startRow];
    boolean is = false;
    for(int col = startCol; col < endCol; col++) {
      for(int row = startRow; row < endRow; row++) {
        if(last != field[col][row]) {
          is = true;
          break;
        }
      }
      if(is) break;
    }
    if(!is) {
      if(last == 0) white++;
      else blue ++;
    } else dnq(field, startCol, startRow, size/2);
  }
}