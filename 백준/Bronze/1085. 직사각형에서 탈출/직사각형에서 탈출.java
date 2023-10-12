import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int x = Integer.parseInt(st.nextToken());
    final int y = Integer.parseInt(st.nextToken());
    final int w = Integer.parseInt(st.nextToken());
    final int h = Integer.parseInt(st.nextToken());

    int W = Math.min(w - x, x);
    int H = Math.min(h - y, y);

    System.out.println(W > H ? H : W);
    br.close();
  }
}