import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < N; i++) {
      final long K = Long.parseLong(br.readLine());

      long exp = (K*(K+1)/2);
      long start = 1;
      long end = 1_000_000_000;
      do {
        long mid = (start+end)/2;
        if(mid * (mid + 1) <= exp)
          start = mid + 1;
        else
          end = mid - 1;
      } while(start <= end);
      sb.append(start).append("\n");
    }
    System.out.print(sb);
    br.close();
  }
}