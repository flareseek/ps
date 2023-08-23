import java.io.*;
import java.util.stream.Stream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int[][] ls = new int[N][2];
        for(int i = 0; i < N; i++) ls[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();

        Arrays.sort(ls, Comparator.comparingInt(a -> a[0]));
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(ls[0][1]);
        int max = 0;
        for(int i = 1; i < N; i++) {
            while(!pq.isEmpty()) {
                if(ls[i][0] >= pq.peek()) pq.remove();
                else break;
            }
            pq.add(ls[i][1]);
            if (max < pq.size()) max = pq.size();
        }
        System.out.println(max);
    }
}
