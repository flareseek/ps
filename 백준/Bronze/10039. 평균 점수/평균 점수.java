import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int result = 0;
    for(int i = 0; i < 5; i ++) {
      int t = Integer.parseInt(br.readLine());
      result += t < 40 ? 40 : t;
    }
    br.close();
    System.out.println(result/5);
  }
}
