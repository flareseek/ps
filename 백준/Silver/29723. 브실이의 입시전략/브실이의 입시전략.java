import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap<>();

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    final int K = Integer.parseInt(st.nextToken());
    while(N-->0) {
      st = new StringTokenizer(br.readLine());
      map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
    }

    int result = 0;
    for(int i = 0; i < K; i++) {
      String str = br.readLine();
      result += map.get(str);
      map.remove(str);
    }
    br.close();

    int[] score = new int[map.size()];
    int x = -1;
    for(int value: map.values())
      score[++x] = value;
    Arrays.sort(score);

    M -= K;
    int min = result;
    int max = result;
    for(int i = 0; i < M; i++) {
      max += score[score.length-1-i];
      min += score[i];
    }

    System.out.print(min);
    System.out.print(" ");
    System.out.println(max);
  }
}
