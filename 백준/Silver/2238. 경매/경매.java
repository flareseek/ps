import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int U = Integer.parseInt(st.nextToken());
    final int N = Integer.parseInt(st.nextToken());
    int[] P = new int[U+1];
    String[] name = new String[U+1];

    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String n = st.nextToken();
      int p = Integer.parseInt(st.nextToken());
      if (name[p] == null) name[p] = n;
      P[p] ++;
    }
    int min = N+1;
    int index = 0;
    for(int i = 1; i < P.length; i++) {
      if (P[i] != 0 && P[i] < min) {
        min = P[i];
        index = i;
      }
    }
    System.out.println(name[index] + " " + index);
    br.close();
  }
}