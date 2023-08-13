import java.io.*;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    HashSet<String> set = new HashSet<>();
    int cnt = 0;
    while(N-->0) {
      String str = br.readLine();
      if(str.contains("ENTER")){
        set = new HashSet<>();
        continue;
      }
      if(set.contains(str)) continue;
      set.add(str);
      cnt ++;
    }
    System.out.println(cnt);
    br.close();
  }
}