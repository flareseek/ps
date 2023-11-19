import java.io.*;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    System.out.println(Integer.parseInt(st.nextToken()) / (double)Integer.parseInt(st.nextToken()));
    br.close();
  }
}
