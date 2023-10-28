import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    char[][] C = new char[N][str.length()/N];
    for(int i = 0; i < str.length(); i++) {
      int t = i%C.length;
      if ((i/N) % 2 == 1) t = C.length - t - 1;
      C[t][i/C.length] = str.charAt(i);
    }
    StringBuilder sb = new StringBuilder();
    for(char[] c: C) sb.append(c);
    System.out.println(sb);
    br.close();
  }
}