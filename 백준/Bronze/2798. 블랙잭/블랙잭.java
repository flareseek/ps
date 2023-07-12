import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int A[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    int max = 0;
    for(int i = 0; i < A.length-2; i ++) {
      if(A[i] > N[1]) continue;
      for(int j = i+1; j < A.length-1; j++) {
        if(A[i]+A[j] > N[1]) continue;
        for(int k = j+1; k < A.length; k++) {
          int t = A[i] + A[j] + A[k];
          if(t == N[1]) {
            System.out.println(t);
            br.close();
            return;
          }
          if(t < N[1] && max < t) max = t;
        }
      }
    }
    System.out.println(max);
    br.close();
  }
}