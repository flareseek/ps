import java.io.*;
import java.util.*;
import java.util.stream.Stream;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] o = br.readLine().split(" ");
        int apple = Integer.parseInt(o[0]);
        int len = Integer.parseInt(o[1]);
        
        int[] f = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();
        Arrays.sort(f);
        for(int n: f) {
            if (n <= len) {
                len ++;
            } else {
                break;
            }
        }
        System.out.println(len);
    }
}