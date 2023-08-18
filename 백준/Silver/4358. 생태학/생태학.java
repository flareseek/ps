import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    SortedMap<String, Integer> map = new TreeMap<>();
    String str = br.readLine();
    int length = 0;
    while(str != null && !str.equals("")) {
      map.put(str, map.getOrDefault(str, 0) + 1);
      length ++;
      str = br.readLine();
    }
    br.close();
    StringBuilder sb = new StringBuilder();
    for(String key: map.keySet()) sb.append(key).append(" ").append(String.format("%.4f", (map.get(key)/(float)length) * 100)).append("\n");
    System.out.print(sb);
  }
}