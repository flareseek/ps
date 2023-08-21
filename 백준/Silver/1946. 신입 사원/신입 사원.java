import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(N-->0) {
            final int n = Integer.parseInt(br.readLine());
            int[][] rank = new int[n][2];
            for(int i = 0; i < n; i++) rank[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(rank, Comparator.comparingInt(a -> a[0]));
            int score = rank[0][1];
            int result = 1;
            for(int i = 1; i < n; i++) {
                if(rank[i][1] < score) {
                    result ++;
                    score = rank[i][1];
                }
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
