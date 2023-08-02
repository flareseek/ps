import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        while(N-->0) set.add(br.readLine());
        int cnt = 0;
        while(M-->0) {
            String str = br.readLine();
            if(set.contains(str)) cnt ++;
        }
        System.out.println(cnt);
        br.close();
    }
}
