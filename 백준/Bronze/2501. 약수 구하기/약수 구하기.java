import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close(); int i = 1;
        for(; i <= N[0] && N[1] != 0; i++)
            if (N[0] % i == 0) N[1] --;
        if (N[1] == 0) System.out.println(--i);
         else System.out.println(0);
    }
}