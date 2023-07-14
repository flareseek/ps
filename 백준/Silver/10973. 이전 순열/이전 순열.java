import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Integer.parseInt(br.readLine());
    int[] NN = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    int stdi = NN.length-1;
    for(; stdi > 0; stdi--){
      if(NN[stdi] < NN[stdi-1]) break;
    }
    if(stdi == 0) {
      System.out.println("-1");
      br.close();
      return;
    }
    int rvi = stdi-1;
    int rvi2 = 0;
    int tmp = 0;
    for(int i = rvi+1; i < NN.length; i++) {
      if(NN[rvi] > NN[i] && tmp < NN[i]){
        rvi2 = i;
        tmp = NN[rvi2];
      }
    }
    if(rvi2 != 0) {
      int t = NN[rvi];
      NN[rvi] = NN[rvi2];
      NN[rvi2] = t;
    }

    for(int i = 0; i < (NN.length-stdi)/2; i++) {
      int t = NN[stdi+i];
      NN[stdi+i] = NN[NN.length-1-i];
      NN[NN.length-1-i] = t;
    }
    StringBuilder sb = new StringBuilder();

    for(int i: NN) sb.append(i).append(" ");
    System.out.println(sb);
    br.close();
  }
}