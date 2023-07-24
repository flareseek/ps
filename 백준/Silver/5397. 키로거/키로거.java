import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    while(N-->0) {
      Stack<Character> stk1 = new Stack<>();
      Stack<Character> stk2 = new Stack<>();

      char[] C = br.readLine().toCharArray();

      for(char c: C) {
        switch (c) {
          case '<':
            if (!stk1.isEmpty()) stk2.push(stk1.pop());
            break;
          case '>':
            if (!stk2.isEmpty()) stk1.push(stk2.pop());
            break;
          case '-':
            if (!stk1.isEmpty()) stk1.pop();
            break;
          default:
            stk1.push(c);
        }
      }
      while(!stk1.isEmpty()) stk2.push(stk1.pop());
      while(!stk2.isEmpty()) sb.append(stk2.pop());
      sb.append("\n");
    }
    System.out.print(sb);
    br.close();
  }
}
