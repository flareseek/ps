import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Map<Integer, Integer> map = new HashMap<>();

    int N = Integer.parseInt(br.readLine());
    int[] stack = new int[N];
    int index = -1;

    while(N-->0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String cmd = st.nextToken();
      if(cmd.equals("push"))  stack[++index] = Integer.parseInt(st.nextToken());
      else if(cmd.equals("pop")) {
        if(index < 0) bw.write("-1\n");
        else bw.write(stack[index--] + "\n");
      }
      else if(cmd.equals("size")) bw.write((index+1) +"\n");
      else if(cmd.equals("empty")) bw.write((index == -1) ? "1\n" : "0\n");
      else if(cmd.equals("top")) bw.write((index == -1) ? "-1\n" : stack[index]+"\n");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}