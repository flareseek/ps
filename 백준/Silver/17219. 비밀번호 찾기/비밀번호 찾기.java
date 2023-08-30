import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();
        while(N-->0) {
            String[] str = br.readLine().split(" ");
            map.put(str[0], str[1]);
        }
        StringBuilder sb = new StringBuilder();
        while (M-->0) sb.append(map.get(br.readLine())).append("\n");
        System.out.print(sb);
        br.close();
    }
}
