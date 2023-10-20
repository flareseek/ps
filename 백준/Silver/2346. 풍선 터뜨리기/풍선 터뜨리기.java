import java.io.*;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    final int[] M = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    final boolean[] C = new boolean[N];

    int index = 0;

    while(N-->1) {
      bw.write(String.valueOf(index+1));
      bw.write(" ");
      C[index] = true;

      int R = M[index];
      if (R > 0) {
        while(R != 0) {
          index = (index + 1) % M.length;
          if (!C[index]) R --;
        }
      } else {
        while(R != 0) {
          index = ((index - 1) + M.length) % M.length;
          if (!C[index]) R++;
        }
      }
    }
    bw.write(String.valueOf(index+1));

    br.close();
    bw.flush();
    bw.close();
  }
}