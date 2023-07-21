import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    while (N-- > 0) {
      char[] cmd = br.readLine().toCharArray();
      int len = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
      Deque<Integer> dq = new LinkedList<>();
      if (len > 0) while (st.hasMoreTokens()) dq.add(Integer.parseInt(st.nextToken()));

      boolean isError = false;
      boolean isLeft = true;
      for (int i = 0; i < cmd.length; i++) {
        if (cmd[i] == 'R') isLeft = !isLeft;
        else {
          if (dq.isEmpty()) {
            isError = true;
            System.out.println("error");
            break;
          }
          if (isLeft) dq.removeFirst();
          else dq.removeLast();
        }
      }
      if (!isError) {
        StringBuilder sb = new StringBuilder();
        if (dq.isEmpty()) sb.append("[]");
        else if (isLeft) {
          sb.append("[").append(dq.removeFirst());
          while (!dq.isEmpty()) sb.append(",").append(dq.removeFirst());
          sb.append("]");
        } else {
          sb.append("[").append(dq.removeLast());
          while (!dq.isEmpty()) sb.append(",").append(dq.removeLast());
          sb.append("]");
        }
        System.out.println(sb);
      }
    }
    br.close();
  }
}