import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());

    Stack<int[]> stack = new Stack<>();
    stack.push(new int[]{0, Integer.parseInt(st.nextToken())});
    for(int i = 1; i < N; i++) {
      int n = Integer.parseInt(st.nextToken());
      while(!stack.isEmpty()) {
        int[] p = stack.peek();
        if(p[1] < n) {
          stack.pop();
          A[p[0]] = n;
        } else break;
      }
      stack.push(new int[]{i, n});
    }
    while(!stack.isEmpty()) A[stack.pop()[0]] = -1;
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < A.length; i++)  sb.append(A[i]).append(" ");
    System.out.println(sb);
    br.close();
  }
}