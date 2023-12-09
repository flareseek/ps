import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] len = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int[] array = new int[len[0] + len[1]];
        int index = 0;
        for(int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                array[index++] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(array);
        br.close();
        StringBuilder sb = new StringBuilder();
        for(int a: array) sb.append(a).append(" ");
        System.out.println(sb);
    }
}
