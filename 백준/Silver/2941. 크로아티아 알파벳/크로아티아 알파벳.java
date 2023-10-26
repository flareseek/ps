import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] r = new String[] { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
    String str = br.readLine();
    br.close();
    for(String m: r)
      str = str.replaceAll(m, "*");
    System.out.println(str.length());
  }
}