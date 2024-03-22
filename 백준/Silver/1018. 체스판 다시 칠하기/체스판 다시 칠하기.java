import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int H = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());
    String[] strs = new String[H];
    for (int i = 0; i < H; i++) strs[i] = br.readLine();
    int min = 64;
    for(int i = 0; i < W-7; i++) {
      int BB = 0, WW = 0;
      for(int j = 0; j<8; j++) {
        int[] t = fn(j, i, strs);
        BB += t[0];
        WW += t[1];
      }
      min = Integer.min(min, Integer.min(BB, WW));
      for(int j = 8; j<H; j++) {
        int[] t = fn(j, i, strs);
        int[] l = fn(j-8, i, strs);
        BB += (t[0] - l[0]);
        WW += (t[1] - l[1]);
        min = Integer.min(min, Integer.min(BB, WW));
      }
    }
    System.out.println(min);
    br.close();
  }
  public static int[] fn(int line, int start , String[] str) {
    int[] A = new int[2];
    for(int i = line%2==1?0:1; i < 8; i+=2) {
      if(str[line].charAt(start+i) == 'B') A[1] ++;
      else A[0] ++;
    }
    for(int i = line%2; i < 8; i+=2) {
      if(str[line].charAt(start+i) == 'B') A[0] ++;
      else A[1] ++;
    }
    return A;
  }
}
