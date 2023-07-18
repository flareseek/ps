import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[][] A = new int[15][15];
    for(int i = 0; i <= 14; i++) A[0][i] = i;
    for(int f = 1; f <= 14; f++) for(int r = 1; r <= 14; r++) A[f][r] = A[f][r-1]+A[f-1][r];

    StringBuilder sb = new StringBuilder();
    while(N-->0) sb.append(A[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())]).append("\n");
    System.out.println(sb);
    br.close();
  }
}