import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    br.close();
    int result = 0;
    for(int i = 0; i <= 6; i++) {
      if ((N & 1) == 1) result ++;
      N >>= 1;
    }
    System.out.println(result);
  }
}