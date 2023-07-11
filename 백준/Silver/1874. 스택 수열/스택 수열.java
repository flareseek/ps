import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String push = "+\n", pop = "-\n", no = "NO";
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack = new Stack<>();
    int last = 0;
    while(N-->0) {
      int n = Integer.parseInt(br.readLine());
      if(last <= n) {
        while(last < n) {
          stack.push(++last);
          sb.append(push);
        }
        stack.pop();
        sb.append(pop);
      } else {
        int t = 0;
        if (stack.isEmpty() || (t=stack.pop())<n) {
          sb.setLength(0);
          sb.append(no);
          break;
        }
        if(t == n) sb.append(pop);
        else {
          while(stack.pop() != n) sb.append(pop);
          sb.append(pop);
        }
      }
    }
    System.out.println(sb);
    br.close();
  }
}