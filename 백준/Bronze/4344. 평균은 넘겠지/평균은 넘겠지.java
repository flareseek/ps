import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int N = Integer.parseInt(br.readLine());
   StringBuilder sb = new StringBuilder();
   while(N-->0) {
     StringTokenizer st = new StringTokenizer(br.readLine());
     int i = Integer.parseInt(st.nextToken());

     int sum = 0;
     int[] s = new int[i];
     while(i-->0) {
       int t = Integer.parseInt(st.nextToken());
       sum += t;
       s[i] = t;
     }
     double avg = (double)sum/s.length;

     int p = 0;
     for(int S: s) if (avg <  S) p++;
     sb.append(String.format("%.3f", ((double)p/s.length)*100.0)).append("%\n");
   }
    System.out.print(sb);
    br.close();
  }
}
