import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    String[] str = new String[N];

    for(int i = 0; i < N; i++)
      str[i] = br.readLine();
    br.close();

    final int strLength = str[0].length();

    for (int x = 1; x <= strLength; x++) {
      HashSet<String> set = new HashSet<>();
      boolean dup = false;
      for(int i = 0; i < N; i++) {
        String s = str[i].substring(strLength-x);
        if (set.contains(s)) {
          dup = true;
          break;
        }
        set.add(s);
      }
      if (!dup) {
        System.out.println(x);
        return;
      }
    }

  }
}