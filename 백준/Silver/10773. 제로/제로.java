import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] stack = new int[N];
    int index = -1;
    while(N-->0) {
      int t = Integer.parseInt(br.readLine());
      if(t==0) index--;
      else stack[++index] = t;
    }
    int sum = 0;
    for(int i = 0; i <= index; i++) sum += stack[i];
    System.out.println(sum);
    br.close();
  }
}