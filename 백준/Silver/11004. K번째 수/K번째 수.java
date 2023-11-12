import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(st.nextToken());
    final int INDEX = Integer.parseInt(st.nextToken());

    List<Integer> numbers = new ArrayList<>();
    st = new StringTokenizer(br.readLine());
    br.close();
    for(int i =  0; i < N; i++)
      numbers.add(Integer.parseInt(st.nextToken()));
    Collections.sort(numbers);
    System.out.println(numbers.get(INDEX-1));
  }
}
