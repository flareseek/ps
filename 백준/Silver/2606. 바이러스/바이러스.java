import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int C = Integer.parseInt(br.readLine());
    int V = Integer.parseInt(br.readLine());

    ArrayList<LinkedList<Integer>> l = new ArrayList<>(C);

    for(int i = 0; i < C; i++) l.add(i, new LinkedList<>());
    while(V-->0) {
      int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      l.get(N[0]-1).add(N[1]-1);
      l.get(N[1]-1).add(N[0]-1);
    }
    boolean[] visited = new boolean[C];
    visited[0] = true;
    Queue<Integer> q = new LinkedList<>();
    q.add(0);
    int result = 0;
    while(!q.isEmpty()) {
      int i = q.poll();
      LinkedList<Integer> ll = l.get(i);
      for(int j: ll) {
        if(visited[j]) continue;
        result ++;
        q.add(j);
        visited[j] = true;
      }
    }
    System.out.println(result);
    br.close();
  }
}