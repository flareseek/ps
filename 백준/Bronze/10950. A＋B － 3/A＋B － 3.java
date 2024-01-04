import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(N-->0) {
            int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sb.append(n[0]+n[1]).append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}