import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    br.close();
    StringBuilder sb = new StringBuilder();
    for(int i = N-1; i > 0; i--) {
      for(int j = 0; j < N-i-1; j++) sb.append(" ");
      for(int j = 0; j < (i+1)*2-1; j++) sb.append("*");
      sb.append("\n");
    }
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N-i-1; j++) sb.append(" ");
      for(int j = 0; j < (i+1)*2-1; j++) sb.append("*");
      sb.append("\n");
    }
    System.out.print(sb);
  }
}
