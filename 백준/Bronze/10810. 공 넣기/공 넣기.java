import java.io.*;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] b = new int[Integer.parseInt(st.nextToken())];
    int N = Integer.parseInt(st.nextToken());

    while(N-->0) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      int i = Integer.parseInt(st.nextToken());
      for(; s <= e; s++) b[s-1] = i;
    }
    br.close();

    StringBuilder sb = new StringBuilder();
    for(int B: b)
      sb.append(B).append(" ");
    System.out.println(sb);
  }
}
