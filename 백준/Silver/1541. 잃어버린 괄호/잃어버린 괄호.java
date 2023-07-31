import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), "-");
    StringTokenizer pn = new StringTokenizer(st.nextToken(), "+");

    int sum = 0;
    while(pn.hasMoreTokens()) sum += Integer.parseInt(pn.nextToken());
    while(st.hasMoreTokens()) {
      StringTokenizer t = new StringTokenizer(st.nextToken(), "+");
      while(t.hasMoreTokens()) sum -= Integer.parseInt(t.nextToken());
    }
    System.out.println(sum);
    br.close();
  }
}