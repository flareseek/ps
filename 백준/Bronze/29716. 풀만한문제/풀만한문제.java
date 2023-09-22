import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int J = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    int result = 0;
    while(N-->0) {
      int score = 0;
      String str = br.readLine();
      for(int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if ('A' <= c && c <= 'Z') score += 4;
        else if ('a' <= c && c <= 'z') score += 2;
        else if ('0' <= c && c <= '9') score += 2;
        else score ++;
      }
      if (score <= J) result ++;
    }
    System.out.println(result);
    br.close();
  }
}
