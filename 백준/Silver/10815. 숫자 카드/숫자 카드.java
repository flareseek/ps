import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    HashMap<String, Integer> map = new HashMap<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    while(N-->0) map.put(st.nextToken(), 1);
    N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    st = new StringTokenizer(br.readLine());
    while(N-->0) {
      String str = st.nextToken();
      if(map.containsKey(str)) sb.append(1);
      else sb.append(0);
      sb.append(" ");
    }
    System.out.println(sb);
    br.close();
  }
}