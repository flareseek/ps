import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            br.readLine();
            HashSet<Integer> set = new HashSet<>();
            int[] n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int s: n) set.add(s);
            br.readLine();
            n = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            StringBuilder sb = new StringBuilder();
            for(int s: n){
                sb.append(set.contains(s) ? 1 : 0).append("\n");
            }
            System.out.print(sb);
        }
        br.close();
    }
}
