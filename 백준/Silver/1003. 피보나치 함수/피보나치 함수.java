import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[][] FB = new int[41][2];
    FB[0][0] = 1; FB[0][1] = 0; FB[1][0] = 0; FB[1][1] = 1;
    for(int i = 2; i < FB.length; i++) {
      FB[i][0] = FB[i-1][0] + FB[i-2][0];
      FB[i][1] = FB[i-1][1] + FB[i-2][1];
    }
    int N = Integer.parseInt(br.readLine());
    while(N-->0) {
      int t = Integer.parseInt(br.readLine());
      bw.write(FB[t][0] + " " + FB[t][1]);
      bw.newLine();
    }
    bw.flush();
    bw.close();
    br.close();
  }
}