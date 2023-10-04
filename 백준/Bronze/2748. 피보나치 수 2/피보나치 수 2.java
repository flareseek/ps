import java.io.*;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    br.close();

    if (N < 2) {
      System.out.println(N);
      return;
    }
    N -= 1;

    long f1 = 0;
    long f2 = 1;
    while(N-->0) {
      long t = f2;
      f2 += f1;
      f1 = t;
    }
    System.out.println(f2);
  }
}