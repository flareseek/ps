import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] A = new int[N][2];

        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A[N][0] = Integer.parseInt(st.nextToken());
            A[N][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A, (a, b) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        StringBuilder sb = new StringBuilder();
        for(int[] a: A) sb.append(a[0]).append(" ").append(a[1]).append("\n");
        System.out.println(sb);
        br.close();
    }
}
