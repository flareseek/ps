import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = 3;
    while(n-->0) {
      String[] m = br.readLine().split(" ");
      int count = 0;
      for(String s: m)
        if (s.equals("0")) count ++;

      switch (count) {
        case 1:
          System.out.println("A");
          break;
        case 2:
          System.out.println("B");
          break;
        case 3:
          System.out.println("C");
          break;
        case 4:
          System.out.println("D");
          break;
        case 0:
          System.out.println("E");
          break;
      }
    }
    br.close();
  }
}
