import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(st.nextToken());
    final int M = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    final int X = Integer.parseInt(st.nextToken());
    final int Y = Integer.parseInt(st.nextToken());

    int e = 0;
    for(int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      if(Integer.parseInt(st.nextToken()) != 0) e ++;
    }
    br.close();

    int result = 1;
    if (N-M > 0) {
      for (int i = 0; i < N-M; i++)
        result *= (9-M-i);
      for (int i = 0; i < M-e; i++)
        result *= (N-e)-i;
    } else {
      for(int i = M-e; i > 0; i--)
        result *= i;
    }
    System.out.println(result*X + ((result-1)/3)*Y);
  }
}
