import java.io.*;
import java.util.Stack;

//Stack으로 풀어봄
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    while(N-->0) {
      char[] C = br.readLine().toCharArray();
      Stack<Character> stack = new Stack<>();
      for(int i = 0; i < C.length; i++){
        if(C[i] == '(') stack.push('(');
        else {
          if(stack.isEmpty()) {
            stack.push(')');
            break;
          } else stack.pop();
        }
      }
      bw.write(stack.isEmpty() ? "YES\n" :"NO\n");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}