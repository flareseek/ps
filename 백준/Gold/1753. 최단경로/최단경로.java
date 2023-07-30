import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int V = Integer.parseInt(st.nextToken());
    int E = Integer.parseInt(st.nextToken());
    ArrayList<LinkedList<int[]>> graph = new ArrayList<>(V+1);
    for(int i = 0; i <= V; i++) graph.add(i, new LinkedList<int[]>());
    int root = Integer.parseInt(br.readLine());

    while(E-->0) {
      int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      graph.get(N[0]).add(new int[]{N[1], N[2]});
    }
    br.close();

    int[] dist = new int[V+1];
    Arrays.fill(dist, V*10);
    dist[root] = 0;

    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
    pq.add(new int[]{root, 0});
    while(!pq.isEmpty()) {
      int[] p = pq.poll();
      for(int[] l: graph.get(p[0])) {
        int dt  = p[1] + l[1];
        if(dt < dist[l[0]]) {
          dist[l[0]] = dt;
          pq.add(new int[]{l[0], dt});
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i < dist.length; i++) sb.append(dist[i] == V*10 ? "INF" : dist[i]).append("\n");
    System.out.print(sb);
  }
}