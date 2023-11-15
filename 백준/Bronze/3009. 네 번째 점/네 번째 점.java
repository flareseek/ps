import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] x = br.readLine().split(" ");

    String[] x1 = br.readLine().split(" ");
    String[] x2 = br.readLine().split(" ");

    if (!x1[0].equals(x2[0])) {
      if (x[0].equals(x1[0])) x[0] = x2[0];
      else x[0] = x1[0];
    }
    if (!x1[1].equals(x2[1])) {
      if (x[1].equals(x1[1])) x[1] = x2[1];
      else x[1] = x1[1];
    }
    System.out.println(x[0] + " " + x[1]);
    br.close();
  }
}
