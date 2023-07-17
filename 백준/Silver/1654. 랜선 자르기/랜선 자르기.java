import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] A = new int[N[0]];
        long max = 0;
        while(N[0]-->0) {
            A[N[0]] = Integer.parseInt(br.readLine());
            if(max < A[N[0]]) max = A[N[0]];
        }
        max++;
        long lo = 0;
        while(lo < max) {
            long mid = (lo+max)/2;
            long sum = 0;
            for(int i = 0; i < A.length; i++) sum += A[i]/mid;
            if(sum < N[1]) max = mid;
            else lo = mid + 1;
        }
        System.out.println(lo-1);
        br.close();
    }
}
