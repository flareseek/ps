import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int result = 0;
    while(N-->0) {
      boolean[] check = new boolean['z'-'a'+1];
      char[] al = br.readLine().toCharArray();
      char lastChar = ' ';
      for(char a: al) {
        if (a != lastChar) {
          if (check[a-'a']) {
            result --;
            break;
          }
          check[a-'a'] = true;
        }
        lastChar = a;
      }
      result ++;
    }
    System.out.println(result);
    br.close();
  }
}