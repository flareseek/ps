import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] graph = new boolean[N+1][N+1];
        boolean[] visited = new boolean[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int f = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        N = Integer.parseInt(br.readLine());
        while(N-->0) {
            st = new StringTokenizer(br.readLine());
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            graph[t1][t2] = true;
            graph[t2][t1] = true;
        }
        br.close();

        Queue<Integer> q = new LinkedList<>();
        q.add(f);
        visited[f] = true;

        int step = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int p = q.poll();
                if(p == s) {
                    System.out.println(step);
                    return;
                }
                for(int e = 1; e < visited.length; e++) {
                    if(graph[p][e] == true && !visited[e]) {
                        visited[e] = true;
                        q.add(e);
                    }
                }
            }
            step ++;
        }
        System.out.println(-1);
    }
}
