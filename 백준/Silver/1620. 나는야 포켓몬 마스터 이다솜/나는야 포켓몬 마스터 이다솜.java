import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    String[] list = new String[N[0]];
    HashMap<String, Integer> map = new HashMap<>();
    while(N[0]-->0) {
      String str = br.readLine();
      map.put(str, list.length - N[0]);
      list[list.length-1-N[0]] = str;
    }
    StringBuilder sb = new StringBuilder();
    while(N[1]-->0) {
      String str = br.readLine();
      if('1' <= str.charAt(0) && str.charAt(0) <= '9') sb.append(list[Integer.parseInt(str)-1]);
      else sb.append(map.get(str));
      sb.append("\n");
    }
    System.out.print(sb);
    br.close();
  }
}