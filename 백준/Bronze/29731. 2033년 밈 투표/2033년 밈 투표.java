import java.io.*;
import java.util.HashSet;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    HashSet<String> set = new HashSet<>();
    set.add("Never gonna give you up");
    set.add("Never gonna let you down");
    set.add("Never gonna run around and desert you");
    set.add("Never gonna make you cry");
    set.add("Never gonna say goodbye");
    set.add("Never gonna tell a lie and hurt you");
    set.add("Never gonna stop");
    while(N-->0) {
      if (!set.contains(br.readLine())) {
        System.out.println("Yes");
        br.close();
        return;
      }
    }
    System.out.println("No");
  }
}
