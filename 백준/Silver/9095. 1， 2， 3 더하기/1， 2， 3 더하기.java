import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] NA = new int[13];
    NA[0] = 1;
    for(int i = 0; i <= 9; i++) {
      NA[i+1] += NA[i];
      NA[i+2] += NA[i];
      NA[i+3] += NA[i];
    }
    int N = Integer.parseInt(br.readLine());
    while(N-->0) bw.write(NA[Integer.parseInt(br.readLine())]+"\n");
    bw.flush();
    bw.close();
    br.close();
  }
}