import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final String str = br.readLine();
    br.close();
    String[] words = new String[str.length()];
    for(int i = 0; i < str.length(); i++) words[i] = str.substring(i);
    Arrays.sort(words);

    StringBuilder sb = new StringBuilder();
    for(String s: words) sb.append(s).append("\n");
    System.out.print(sb);
  }
}