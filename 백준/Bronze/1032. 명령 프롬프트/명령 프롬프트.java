import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] str = new String[N];

    while(N-->0)
      str[N] = br.readLine();
    br.close();


    if(str.length == 1) {
      System.out.println(str[0]);
      return;
    }

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < str[0].length(); i++) {
      char l = str[0].charAt(i);
      boolean is = false;
      for(int k = 1; k < str.length; k++) {
        if (l != str[k].charAt(i)) {
          is = true;
          break;
        }
      }
      if (!is) sb.append(l);
      else sb.append("?");
    }
    System.out.println(sb);
  }
}