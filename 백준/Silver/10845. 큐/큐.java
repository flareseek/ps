import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Queue<Integer> q = new LinkedList<>();
    int N = Integer.parseInt(br.readLine());
    int last = 0;
    while(N-->0) {
      String cmd = br.readLine();

      if(cmd.startsWith("pu")) {
        int t = Integer.parseInt(cmd.split(" ")[1]);
        q.add(t);
        last = t;
      }
      else if(cmd.startsWith("po")) {
        if(q.isEmpty()) bw.write("-1\n");
        else bw.write(q.poll() + "\n");
      }
      else if(cmd.startsWith("si")) bw.write(q.size()+"\n");
      else if(cmd.startsWith("em")) bw.write(q.isEmpty() ? "1\n" : "0\n");
      else if(cmd.startsWith("fr")) {
        if(q.isEmpty()) bw.write("-1\n");
        else bw.write(q.peek()+"\n");
      }
      else {
        if(q.isEmpty()) bw.write("-1\n");
        else bw.write(last + "\n");
      }
    }
    bw.flush();
    bw.close();
    br.close();
  }
}