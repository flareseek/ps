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

        Arrays.sort(ls, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            else return a[0] - b[0];
        });
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(ls[0][1]);
        for(int i = 1; i < N; i++) {
            if (ls[i][0] >= pq.peek()) pq.remove();
            pq.add(ls[i][1]);
        }
        System.out.println(pq.size());
    }
}
