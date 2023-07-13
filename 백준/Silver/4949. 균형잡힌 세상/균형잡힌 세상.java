import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str;
    while(!(str = br.readLine()).equals(".")) {
      Stack<Boolean> stack = new Stack<>();
      char[] C = str.toCharArray();
      boolean is = true;
      for(int i = 0; i < C.length; i++) {
        if(C[i] == '(') stack.push(false);
        else if(C[i] == '[') stack.push(true);
        else if(C[i] == ')') {
          if(stack.isEmpty() || stack.peek()) {
            is = false;
            break;
          } else stack.pop();
        }
        else if(C[i] == ']'){
          if(stack.isEmpty() || !stack.peek()) {
            is = false;
            break;
          } else stack.pop();
        }
      }
      if((!stack.isEmpty()) || (!stack.isEmpty())) is = false;
      bw.write(is ? "yes\n" : "no\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}