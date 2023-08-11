import java.util.*;
class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        ArrayList<LinkedList<Integer>> field = new ArrayList<>(n+1);
        for(int i = 0; i <= n; i++) field.add(i, new LinkedList());
        for(int[] R: roads) {
            field.get(R[0]).add(R[1]);
            field.get(R[1]).add(R[0]);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int s: sources) map.put(s, -1);
        
        boolean[] visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(destination);
        visited[destination] = true;
        
        int step = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int p = q.poll();
                if(map.containsKey(p) && map.get(p) == -1) map.put(p, step);
                for(int f: field.get(p)) {
                    if(visited[f]) continue;
                    visited[f] = true;
                    q.add(f);
                }
            }
            step ++;
        }
        int[] result = new int[sources.length];
        int resultIndex = -1;
      	for(int s: sources) result[++resultIndex] = map.get(s);
       return result; 
    }
}