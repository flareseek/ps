import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    String[] str = new String[1000001];
    for(int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int t = Integer.parseInt(st.nextToken());
      str[t] = new StringBuilder().append(str[t] != null ? str[t] : "").append("\n").append(t).append(" ").append(st.nextToken()).toString();
    }

      for(int i = 0; i< str.length && N > 0; i++) {
        if(str[i] != null) {
          bw.write(str[i].trim());
          bw.newLine();
          N--;
        }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}