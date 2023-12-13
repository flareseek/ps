import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new TreeMap<>();
        while (N-- > 0) {
            Long n = Long.parseLong(br.readLine());
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        long index = 0l;
        for (Long k : map.keySet()) {
            if ((map.get(k) > map.getOrDefault(index, 0))
                    || (map.get(k) == map.getOrDefault(index, 0) && index > k)) {
                index = k;
            }
        }
        br.close();
        System.out.println(index);
    }
}
