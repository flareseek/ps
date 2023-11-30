import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    while(N-->0) {
      String[] str = br.readLine().split(" ");

      bw.write(String.valueOf(Integer.parseInt(str[0]) + Integer.parseInt(str[1])));
      bw.newLine();
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
