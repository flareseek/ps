import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];

        while(N-->0) A[N] = Integer.parseInt(br.readLine());
        Arrays.sort(A);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < A.length; i++) sb.append(A[i]).append("\n");
        System.out.println(sb);

        br.close();
    }
}
