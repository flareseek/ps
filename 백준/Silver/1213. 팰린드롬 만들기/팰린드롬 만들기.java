import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char[] C = br.readLine().toCharArray();
    int[] A = new int[91-65];
    for(int i = 0; i < C.length; i++) A[C[i]-65] ++;
    int index = -1;
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i< A.length; i++) {
      if(A[i] % 2 == 1) {
        if(index != -1) {
          System.out.println("I'm Sorry Hansoo");
          br.close();
          return;
        } else index = i;

      }
      for(int j = 0; j < A[i]/2; j++) sb.append((char)(i+65));
    }
    String rv = new StringBuilder().append(sb.toString()).reverse().toString();
    if(index == -1) sb.append(rv);
    else sb.append((char)(index+65)).append(rv);
    System.out.println(sb);
    br.close();
  }
}