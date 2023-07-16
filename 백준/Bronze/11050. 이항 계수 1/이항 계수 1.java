import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(f(N[0])/(f(N[0]-N[1])*f(N[1])));
        br.close();
    }
    public static int f (int n) {
        if(n == 1 || n==0) return 1;
        return n * f(n-1);
    }
}