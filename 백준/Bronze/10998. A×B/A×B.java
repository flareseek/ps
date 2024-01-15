import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).reduce(1, (a, b) -> a*b));
        br.close();
    }
}