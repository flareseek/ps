import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
      int a1 = Math.abs(a), b1 = Math.abs(b);
      if (a1 == b1) return a - b;
      return a1 - b1;
    });
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    while(N-->0) {
      int t = Integer.parseInt(br.readLine());
      if(t == 0) {
        if(pq.isEmpty())sb.append(0);
        else sb.append(pq.poll());
        sb.append("\n");
      }
      else pq.add(t);
    }
    System.out.print(sb);
    br.close();
  }
}