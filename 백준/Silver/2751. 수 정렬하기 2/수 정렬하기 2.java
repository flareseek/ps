import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N];
    while(N-->0) A[N] = Integer.parseInt(br.readLine());
    Arrays.sort(A);

    for(int i = 0; i < A.length; i++) bw.write(A[i]+"\n");

    bw.flush();
    bw.close();
    br.close();
  }
}