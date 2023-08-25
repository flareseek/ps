import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        final int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) pq.add(Integer.parseInt(br.readLine()));
        br.close();
        if (N == 1) {
            System.out.println(0);
            return;
        } else if (N == 2) {
            System.out.println(pq.poll() + pq.poll());
            return;
        }
        int result = pq.poll() + pq.poll();
        pq.add(result);
        while(pq.size() > 1) {
            int p = pq.poll() + pq.poll();
            result += p;
            pq.add(p);
        }
        System.out.println(result);
    }
}
