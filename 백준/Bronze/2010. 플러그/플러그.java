import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int result = 1;
    while(N-->0)
      result += (Integer.parseInt(br.readLine()) - 1);
    br.close();
    System.out.println(result);
  }
}
