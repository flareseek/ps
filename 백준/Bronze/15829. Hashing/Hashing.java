import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int M = 1234567891;
    int N = Integer.parseInt(br.readLine());
    char[] C = br.readLine().toCharArray();
    long r = 1; //(r^0 Mod M)
    long sum = 0;
    while(N-->0) {
      sum += (C[C.length-1-N]-'a'+1)*r % M;
      r = r*31%M;
    }
    System.out.println(sum%M);

    br.close();
  }
}
