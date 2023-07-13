import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Map<Integer, Integer> map = new HashMap<>();

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] A = new int[20000001];
    while(N-->0) {
      int t = Integer.parseInt(st.nextToken());
      A[t+10000000] ++;
    }

    N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    while(N-->0) {
      int t = Integer.parseInt(st.nextToken());
      bw.write(A[t+10000000] + " ");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}