import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());

    int appleV = 0;
    int baeV = 0;
    int apples = 0;

    for(int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String type = st.nextToken();
      final int W = Integer.parseInt(st.nextToken());
      final int H = Integer.parseInt(st.nextToken());
      final int L = Integer.parseInt(st.nextToken());
      if (type.equals("A")) {
        final int count = (W/12) * (H/12) * (L/12);
        apples += count;
        appleV += (count)*500 + 1000;
      } else baeV += 120*50;
    }
    System.out.println(appleV + baeV);
    System.out.println(4000 * apples);
    br.close();
  }
}
