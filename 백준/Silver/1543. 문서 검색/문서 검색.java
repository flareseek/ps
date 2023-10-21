import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String T = str;
    final String p = br.readLine();

    int count = 0;
    while(!(str = str.replaceFirst(p, ".")).equals(T)) {
      count ++;
      T = str;
    }
    System.out.println(count);
    br.close();
  }
}