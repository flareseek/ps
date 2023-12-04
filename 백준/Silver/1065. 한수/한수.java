import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    br.close();
    int count = 0;
    for(int i = 1; i <= N; i++) {
      if (i < 100) {
        count ++;
      } else if (i < 1000){
        int a = i/100 - (i%100/10);
        int b = (i%100/10) - (i%10);
        if (a==b) count ++;
      }
    }
    System.out.println(count);
  }
}
