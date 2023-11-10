import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    br.close();
    StringBuilder sb = new StringBuilder();
    for(int o = 0; o < N; o++) {
      for(int i = 0; i < (2*(N-1))/2-o; i++) sb.append(" ");
      for(int i = 0; i < (1 + (2*o)); i++) sb.append("*");
      sb.append("\n");
    }
    for(int o = N-2; o >= 0; o--) {
      for(int i = 0; i < (2*(N-1))/2-o; i++) sb.append(" ");
      for(int i = 0; i < (1 + (2*o)); i++) sb.append("*");
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
