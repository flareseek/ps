import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        HashMap<Character, Integer> rank = new HashMap<>();
        char[][] str = new char[N][];
        for(int i = 0; i < N; i++) {
            str[i] = br.readLine().toCharArray();
            int w = 1;
            for(int c = str[i].length - 1; c >= 0; c--) {
                rank.put(str[i][c], rank.getOrDefault(str[i][c], 0) + w);
                w *= 10;
            }
        }
        br.close();
        HashMap<Character, Integer> hash = new HashMap<>();
        List<Character> keys = new ArrayList<>(rank.keySet());
        Collections.sort(keys, (a, b) -> rank.get(b) - rank.get(a));
        int dec = 10;
        for(char key: keys)
            hash.put(key, --dec );

        int result = 0;
        for(char[] C: str){
            int temp = 0;
            for(char c: C) {
                temp = temp * 10 + hash.get(c);
            }
            result += temp;
        }
        System.out.println(result);
    }
}