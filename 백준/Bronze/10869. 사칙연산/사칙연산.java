import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(n[0]+n[1]).append("\n");
        sb.append(n[0]-n[1]).append("\n");
        sb.append(n[0]*n[1]).append("\n");
        sb.append(n[0]/n[1]).append("\n");
        sb.append(n[0]%n[1]).append("\n");
        System.out.print(sb);
    }
}