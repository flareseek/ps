import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final long N = Long.parseLong(st.nextToken());
    final long M = Long.parseLong(st.nextToken());

    st = new StringTokenizer(br.readLine());
    final long T = Long.parseLong(st.nextToken());
    final long S = Long.parseLong(st.nextToken());

    final long ZIP = N + ((N-1)/8)*S;
    final long DOCK = M + T + ((M-1)/8)*S + ((M-1)/8) * T*2;

    System.out.println(ZIP < DOCK ? "Zip" : "Dok");
    System.out.println(Math.min(ZIP, DOCK));
    br.close();
  }
}
