import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int result = 0;
    for(int i = 0; i < 8; i++) {
      String[] st = br.readLine().split("");
      for(String str: st) {
        switch (str) {
          case "P":
            result += 1;
            break;
          case "p":
            result -= 1;
            break;
          case "B":
          case "N":
            result += 3;
            break;
          case "b":
          case "n":
            result -= 3;
            break;
          case "R":
            result += 5;
            break;
          case "r":
            result -= 5;
            break;
          case "Q":
            result += 9;
            break;
          case "q":
            result -= 9;
            break;
        }
      }
    }
    System.out.println(result);
    br.close();
  }
}
