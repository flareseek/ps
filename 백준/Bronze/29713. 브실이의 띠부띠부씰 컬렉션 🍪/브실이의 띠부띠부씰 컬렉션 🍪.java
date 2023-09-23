import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    br.close();

    int[] c = new int['Z' - 'A' + 1];
    for(int i = 0; i < N; i++)
      c[str.charAt(i)-'A'] ++;

    int min = N;
    for(int i = 0; i < c.length; i++) {
      int t = i + 'A';
      switch (t) {
        case 'B':
        case 'O':
        case 'N':
        case 'Z':
        case 'S':
        case 'I':
        case 'L':
        case 'V':
          if (c[i] < min) min = c[i];
          break;

        case 'R':
        case 'E':
          if (c[i]/2 < min) min = c[i]/2;
          break;
      }
    }
    System.out.println(min);
  }
}

