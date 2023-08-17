import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] C = br.readLine().toCharArray();
    HashSet<String> set = new HashSet<>();
    for(int i = 0; i < C.length; i++) {
      for(int j = 0; j < C.length-i; j++) {
        StringBuilder sb = new StringBuilder();
        for(int k = 0; k <= i; k++) sb.append(C[j+k]);
        set.add(sb.toString());
      }
    }
    System.out.println(set.size());
    br.close();
  }
}