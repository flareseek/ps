import java.io.*;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
    br.close();

    for(int k = (numbers.length/2)*2; k >= 2; k-= 2) {
      for(int r = 0; k+r <= numbers.length; r++) {

        int L = 0;
        int R = 0;
        for(int i = 0; i < k/2; i++) {
          L += numbers[r+i];
          R += numbers[r+(k/2 + i)];
        }
        if (L==R) {
          System.out.println(k);
          return;
        }
      }
    }
    System.out.println(0);
  }
}