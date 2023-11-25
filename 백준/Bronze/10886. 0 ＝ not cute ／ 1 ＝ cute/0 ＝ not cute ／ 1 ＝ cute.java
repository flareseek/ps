import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] numbers = new int[2];
    while(N-->0) numbers[Integer.parseInt(br.readLine())] ++;
    br.close();
    System.out.println(numbers[0] > numbers[1] ? "Junhee is not cute!" : "Junhee is cute!");
  }
}
