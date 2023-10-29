import java.io.*;
import java.util.Arrays;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] number = br.readLine().toCharArray();
    br.close();

    int chk = 0;
    for (char c : number) chk += c - '0';
    if (chk % 3 != 0) {
      System.out.println(-1);
      return;
    }
    Arrays.sort(number);
    if (number[0] != '0') {
      System.out.println(-1);
      return;
    }
    System.out.println(new StringBuilder().append(number).reverse());
  }
}