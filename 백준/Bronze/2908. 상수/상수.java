import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] number = Stream.of(new StringBuilder().append(br.readLine()).reverse().toString().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();
        System.out.println(number[0] > number[1] ? number[0] : number[1]);
    }
}