import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int M = 1234567891;

    int N = Integer.parseInt(br.readLine());
    char[] C = br.readLine().toCharArray();
    long t = 0;
    long r = 1;
    while(N-->0) {
      t += (C[C.length-1-N] - 'a' + 1) * r;
      r *= 31;
    }
    System.out.println(t%M);

    br.close();
  }
}