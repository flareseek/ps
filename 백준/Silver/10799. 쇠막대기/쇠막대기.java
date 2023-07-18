import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] C = br.readLine().toCharArray();
    br.close();

    int[] stack = new int[C.length/2];
    int top = -1;
    int cnt = 0;
    for(int i = 0; i < C.length; i++) {
      if(C[i] == '(') stack[++top] = -1;
      else {
        if(stack[top] == -1) stack[top] = 1;
        else {
          int temp = 0;
          while(stack[top] != -1) temp += stack[top--];
          stack[top] = temp;
          cnt += temp + 1;
        }
      }
    }
    System.out.println(cnt);
  }
}