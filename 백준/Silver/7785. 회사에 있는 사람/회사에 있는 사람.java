import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    HashSet<String> set = new HashSet<>();
    for(int i = 0; i < N; i++) {
      String[] str = br.readLine().split(" ");
      if (str[1].equals("enter")) set.add(str[0]);
      else if (str[1].equals("leave")) set.remove(str[0]);
    }
    br.close();

    ArrayList<String> al = new ArrayList<>(set);
    Collections.sort(al, Comparator.reverseOrder());

    StringBuilder sb = new StringBuilder();
    for(String a: al)
      sb.append(a).append("\n");

    System.out.print(sb);
  }
}