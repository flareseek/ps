import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    br.close();
    StringBuilder sb = new StringBuilder();
    final int result = A*B;
    sb.append(A*(B%10)).append("\n").append(A*((B/10)%10)).append("\n").append(A*(B/100)).append("\n").append(result);
    System.out.println(sb);
  }
}
