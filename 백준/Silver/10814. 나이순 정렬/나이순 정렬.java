import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    TreeMap<Integer, Queue<String>> map = new TreeMap<>();

    while(N-->0){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      if(map.containsKey(n)) {
        map.get(n).add(st.nextToken());
      } else {
        map.put(n, new LinkedList<String>());
        map.get(n).add(st.nextToken());
      }
    }
    for(int key: map.keySet()) {
      while(map.get(key).size() != 0) {
        bw.write(key + " ");
        bw.write(map.get(key).poll());
        bw.newLine();
      }
    }
    bw.flush();
    bw.close();
    br.close();
  }
}