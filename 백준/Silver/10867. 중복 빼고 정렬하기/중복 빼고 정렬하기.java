import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    TreeSet<Integer> set = new TreeSet<>();
    while(N-->0) set.add(Integer.parseInt(st.nextToken()));

    Iterator<Integer> it = set.iterator();
    StringBuilder sb = new StringBuilder();
    while(it.hasNext()) sb.append(it.next()).append(" ");

    System.out.println(sb);
    br.close();
  }
}