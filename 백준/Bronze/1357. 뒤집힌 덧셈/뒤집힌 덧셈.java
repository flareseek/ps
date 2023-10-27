import java.io.*;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] a = new int[2];
    for(int q = 0; q < 2; q++) {
      char[] C = st.nextToken().toCharArray();
      int k = 1;
      for(int i = 0; i < C.length; i++) {
        a[q] += (C[i] - '0') * k;
        k *= 10;
      }
    }
    System.out.println(Integer.parseInt((new StringBuilder()).append(a[0]+a[1]).reverse().toString()));
    br.close();
  }
}