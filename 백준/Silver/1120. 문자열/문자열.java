import java.io.*;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str =  br.readLine().split(" ");
    br.close();

    int min = 100;
    for(int i = 0; i <= str[1].length() - str[0].length(); i++) {
      int t = 0;
      for(int k = 0; k < str[0].length(); k++) {
        if (str[0].charAt(k) != str[1].charAt(k+i)) t++;
      }
      if (t < min) min = t;
    }
    System.out.println(min);
  }
}