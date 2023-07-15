import java.io.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer.parseInt(br.readLine());
    int[] NN = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();

    int stdi = NN.length-1;
    for(; stdi > 0; stdi--) if(NN[stdi] > NN[stdi-1]) break;

    if(stdi == 0) {
      System.out.println("-1");
      return;
    }

    int swi = stdi-1;
    int swi2 = stdi;
    for(int i = stdi; i < NN.length; i++) if(NN[swi] < NN[i] && NN[swi2] > NN[i]) swi2 = i;

    int t = NN[swi];
    NN[swi] = NN[swi2];
    NN[swi2] = t;

    for(int i = 0; i < (NN.length-stdi)/2; i++) {
      t = NN[stdi+i];
      NN[stdi+i] = NN[NN.length-1-i];
      NN[NN.length-1-i] = t;
    }
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < NN.length; i++) sb.append(NN[i]).append(" ");
    System.out.println(sb);
  }
}