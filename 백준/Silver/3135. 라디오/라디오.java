import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] F = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = Integer.parseInt(br.readLine());
        int diff = Math.abs(F[0] - F[1]);
        while(N-->0) {
            int n = Integer.parseInt(br.readLine());
            int d = Math.abs(n-F[1]);
            if (d < diff) diff = d;
        }
        System.out.println(diff == Math.abs(F[0] - F[1]) ? diff : diff+1);
        br.close();
    }
}
