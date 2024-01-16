import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(N-->0) {
            int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            n[0] = n[0] % 10;
            int result = 1;
            while(n[1]-->0)
                result = (result * n[0])%10;
            sb.append(result == 0 ? 10 : result).append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}