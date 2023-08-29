import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(N-->0) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            while (n-->0) {
                String[] str = br.readLine().split(" ");
                map.put(str[1], map.getOrDefault(str[1], 1) + 1);
            }
            int result = 1;
            for(String key: map.keySet()) result *= map.get(key);
            sb.append(result-1).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
