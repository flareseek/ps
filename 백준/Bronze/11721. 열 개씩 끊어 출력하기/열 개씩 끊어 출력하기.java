import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String t = br.readLine();
    br.close();
    StringBuilder sb = new StringBuilder();
    sb.append(t.charAt(0));
    for(int i = 1; i < t.length(); i++) {
      if (i % 10 == 0) sb.append("\n");
      sb.append(t.charAt(i));
    }
    System.out.println(sb);
  }
}
