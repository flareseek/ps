import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    HashSet<String> set = new HashSet<>();
    int N = Integer.parseInt(br.readLine()) - 1;
    set.add(br.readLine());

    while(N-->0) {
      String word = br.readLine();
      Iterator<String> it = set.iterator();
      boolean check = false;
      while(it.hasNext()) {
        String s = it.next();
        if (s.length() != word.length()) continue;

        for(int i = 0; i < s.length(); i++) {
          if (s.charAt(i) == word.charAt(0)) {
            String t = s;
            String t2 = t.substring(0, i);
            t = t.substring(i, t.length()) + t2;

            if (t.equals(word)) {
              check = true;
              break;
            }
          }
        }
      }
      if (!check) set.add(word);
    }
    System.out.println(set.size());
    br.close();
  }
}