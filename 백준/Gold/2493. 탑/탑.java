import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        Stack<int[]> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty()) {
                int[] peek = stack.peek();
                if (peek[1] < n) stack.pop();
                else {
                    sb.append(peek[0]);
                    break;
                }
            }
            if (stack.isEmpty()) sb.append(0);
            sb.append(" ");
            stack.push(new int[]{i + 1, n});
        }
        System.out.println(sb);
        br.close();
    }
}