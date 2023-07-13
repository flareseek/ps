import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[][] FB = new int[2][41];
    FB[0][0] = 1; FB[0][1] = 0; FB[1][0] = 0; FB[1][1] = 1;
    for(int i = 2; i < 41; i++) {
      FB[0][i] = FB[0][i-1] + FB[0][i-2];
      FB[1][i] = FB[1][i-1] + FB[1][i-2];
    }
    int N = Integer.parseInt(br.readLine());
    while(N-->0) {
      int t = Integer.parseInt(br.readLine());
      bw.write(FB[0][t] + " " + FB[1][t]);
      bw.newLine();
    }
    bw.flush();
    bw.close();
    br.close();
  }
}