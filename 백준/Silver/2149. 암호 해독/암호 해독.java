import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] key = br.readLine().toCharArray();
    char[] okey = key.clone();

    String s = br.readLine();
    final int sLen = s.length();
    final int x = sLen/key.length;
    char[][] enc = new char[key.length][x];

    for(int i = 0; i < sLen; i++)
      enc[i/x][i%x] = s.charAt(i);

    Arrays.sort(key);

    char[][] result = new char[enc.length][enc[0].length];
    for(int i = 0; i < key.length; i++) {
      char k = key[i];
      for(int j = 0; j < okey.length; j++) {
        if (k != okey[j]) continue;
        okey[j] = ' ';
        result[j] = enc[i];
        break;
      }
    }
    StringBuilder sb = new StringBuilder();
    for(int c = 0; c < result[0].length; c++) {
      for(int r = 0; r < result.length; r++) {
        sb.append(result[r][c]);
      }
    }
    System.out.println(sb);
    br.close();
  }
}