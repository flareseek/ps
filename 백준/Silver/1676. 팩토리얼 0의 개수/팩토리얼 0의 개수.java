import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int t = 1;
    int result = 1;
    int cnt = 0;
    while(N-->0) {
      result *= t++;
      if(result%10==0) cnt++;
      else {
        result %= 1000;
        continue;
      }
      for(int i = 100;; i*=10) {
        if(result % i != 0){
          result = result/(i/10) % 1000;
          break;
        }
        else cnt ++;
      }
    }
    System.out.println(cnt);
    br.close();
  }
}
