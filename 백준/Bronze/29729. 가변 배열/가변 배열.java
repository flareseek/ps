import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int length = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
    int location = 0;
    
    while(N-->0) {
      int c = Integer.parseInt(br.readLine());
      if (c == 1) {
        if (length <= location) length *= 2;
        location++;
        continue;
      }
      location --;
    }
    System.out.println(length);
    br.close();
  }
}
