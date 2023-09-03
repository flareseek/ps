import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final char[] C = br.readLine().toCharArray();
    final char[] M = br.readLine().toCharArray();
    br.close();

    Stack<char[]> stack = new Stack<>();
    for (char c : C) {
      int P = stack.isEmpty() ? 0 : stack.peek()[1];
      if (c == M[P]) {
        if (P + 1 >= M.length) {
          while (P-- > 0) stack.pop();
        } else stack.push(new char[]{c, (char) (P + 1)});
      } else {
        if (c == M[0]) stack.push(new char[]{c, 1});
        else stack.push(new char[]{c, 0});
      }
    }

    if (stack.isEmpty()) {
      System.out.println("FRULA");
      return;
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) sb.append(stack.pop()[0]);
    System.out.print(sb.reverse());
  }
}