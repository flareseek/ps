import java.io.*;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Stack<Character> stack = new Stack<>();
    for(char c: br.readLine().toCharArray()) stack.push(c);
    int N = Integer.parseInt(br.readLine());
    Stack<Character> tStack = new Stack<>();
    while (N-- > 0) {
      String cmd = br.readLine();
      if (cmd.startsWith("L")) {
        if(!stack.isEmpty()) tStack.push(stack.pop());
      } else if (cmd.startsWith("D")) {
        if(!tStack.isEmpty()) stack.push(tStack.pop());
      } else if (cmd.startsWith("B")) {
        if(stack.isEmpty()) continue;
        stack.pop();
      } else if (cmd.startsWith("P")) {
        stack.push(cmd.charAt(2));
      }
    }

    StringBuilder sb = new StringBuilder();
    while(!stack.isEmpty()) sb.append(stack.pop());
    sb.reverse();
    while(!tStack.isEmpty()) sb.append(tStack.pop());
    System.out.println(sb);
    br.close();
  }
}