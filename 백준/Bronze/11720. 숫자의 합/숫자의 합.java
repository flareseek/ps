import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] N = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for(int n: N)  sum += n;
        System.out.println(sum);
        br.close();
    }
}
