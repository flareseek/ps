import java.io.*;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int row = 0;
    int col = 0;
    int max = 0;
    for(int r = 1; r <= 9; r++) {
      int[] A = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for(int c = 1; c <= A.length; c++) {
        if (max <= A[c-1]) {
          max = A[c-1];
          row = r;
          col = c;
        }
      }
    }
    br.close();
    System.out.println(max);
    System.out.print(row + " " + col);
  }
}
