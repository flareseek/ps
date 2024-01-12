import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int p = Integer.parseInt(br.readLine().split(" ")[1]);

        int[] numbers = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();
        StringBuilder sb = new StringBuilder();
        for(int n: numbers)
            if (n < p)
                sb.append(n).append(" ");
        System.out.println(sb);
    }
}