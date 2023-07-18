import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine())-1;

    if(N == 0) System.out.println(1);
    else {
      int i = 1;
      while(N > 0) N -= 6*i++;
      System.out.println(i);
    }
    br.close();
  }
}