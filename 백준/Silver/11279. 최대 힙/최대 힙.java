import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
    while(N-->0) {
      int in = Integer.parseInt(br.readLine());
      if(in == 0) {
        if(pq.isEmpty()) sb.append(0);
        else sb.append(pq.poll());
        sb.append("\n");
      }
      else pq.add(in);
    }
    System.out.print(sb);
    br.close();
  }
}