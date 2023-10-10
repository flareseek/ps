import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str;
    while(!(str = br.readLine()).equals("*")) {
      final int len = str.length();
      if (len == 1 || len == 2) {
        sb.append(str).append(" is surprising.").append("\n");
        continue;
      }

      boolean is = false;
      for(int i = 1; i <= str.length() - 1; i++) {
        HashSet set = new HashSet();
        for(int k = 0; k < str.length() - i; k ++) {
          String p = new StringBuilder().append(str.charAt(k)).append(str.charAt(k+i)).toString();
          if (set.contains(p)) {
            sb.append(str).append(" is NOT surprising.").append("\n");
            i = len;
            is = true;
            break;
          }
          set.add(p);
        }
      }
      if (!is) sb.append(str).append(" is surprising.").append("\n");
    }
    System.out.print(sb);
    br.close();
  }
}