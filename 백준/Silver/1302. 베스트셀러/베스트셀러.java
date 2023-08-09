import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> map = new TreeMap<>();
        while(N-->0) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int max = 0;
        String maxStr = null;
        for(String key: map.keySet()) if(max < map.get(key)) {
            max = map.get(key);
            maxStr = key;
        }
        System.out.println(maxStr);
        br.close();
    }
}
