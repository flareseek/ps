import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= N[0]; i++) q.add(i);

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(!q.isEmpty()) {
            for(int i = 1; i < N[1]; i++) q.add(q.poll());
            sb.append(q.poll()).append(", ");
        }
        sb.delete(sb.lastIndexOf(","), sb.length()).append(">");
        System.out.println(sb);
        br.close();
    }
}
