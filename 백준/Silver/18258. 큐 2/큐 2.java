import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());

    LinkedList<Integer> dq = new LinkedList<>();
    while (N-- > 0) {
      String cmd = br.readLine();
      if (cmd.startsWith("pus")) dq.addLast(Integer.parseInt(cmd.split(" ")[1]));
      else if (cmd.startsWith("size")) bw.write(dq.size() + "\n");
      else if (cmd.startsWith("emp")) bw.write(dq.isEmpty() ? "1\n" : "0\n");
      else if (dq.isEmpty()) bw.write("-1\n");
      else if (cmd.startsWith("fro")) bw.write(dq.getFirst() + "\n");
      else if (cmd.startsWith("pop")) bw.write(dq.removeFirst() + "\n");
      else bw.write(dq.getLast() + "\n");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}