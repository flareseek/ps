import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] p = {1, 2, 3};
    while(N-->0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int f = Integer.parseInt(st.nextToken())-1;
      int s = Integer.parseInt(st.nextToken())-1;
      int t = p[f];
      p[f] = p[s];
      p[s] = t;
    }
    for(int i = 0; i < 3; i++) {
      if (p[i] == 1) {
        System.out.println(i+1);
        break;
      }
    }
    br.close();
  }
}