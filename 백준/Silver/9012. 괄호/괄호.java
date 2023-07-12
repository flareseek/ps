import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    while(N-->0) {
      char[] C = br.readLine().toCharArray();
      if(C[0] != '(' || C[C.length-1] != ')' || C.length%2 ==1) bw.write("NO\n");
      else {
        int s = 0;
        for(int i = 0; i < C.length && s >= 0; i++) {
          if(C[i] == '(') s++;
          else s--;
        }
        bw.write(s==0 ? "YES\n" : "NO\n");
      }
    }
    bw.flush();
    bw.close();
    br.close();
  }
}