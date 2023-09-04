import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] C = br.readLine().toCharArray();
    int count = 0;
    int last = -1;
    for(char c: C) {
      if (last != c) {
        count ++;
        last = c;
      }
    }
    System.out.println(count/2);
    br.close();
  }
}