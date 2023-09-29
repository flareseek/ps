import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        final int K = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        br.close();
        int min = -1;
        int max = 0;
        int result = 0;
        for(int i = 0; i < N; i++) {
            if (str.charAt(i) == 'R') {
                final int l = i-K;
                final int r = i+K;
                if (min == -1) {
                    min = Math.max(0, l);
                    max = Math.min(N-1, r);
                } else if (l <= max) {
                    max = Math.min(N-1, r);
                } else {
                    result += (max - min + 1);
                    min = Math.max(0, l);
                    max = Math.min(N-1, r);
                }
            }
        }
        if (min != -1)
            result += (max - min + 1);
        System.out.println(result <= M ? "Yes" : "No");
    }
}
