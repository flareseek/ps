import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numbers = br.readLine().split(" ");
    br.close();

    int min = 0;
    int max = 0;
    for(String n: numbers) {
      int m = 0;
      int M = 0;

      for(int i = 0; i < n.length(); i++) {
        int N = n.charAt(i) - '0';
        if (N == 5 || N == 6) {
          m = m*10 + 5;
          M = M*10 + 6;
        } else {
          m = m*10 + N;
          M = M*10 + N;
        }
      }
      min += m;
      max += M;
    }
    System.out.println(min + " " + max);
  }
}
