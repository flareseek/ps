import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int[] numbers = new int['9'-'0'];
    int max = 0;
    for(int i = 0; i < str.length(); i++) {
      int n = str.charAt(i)-'0';
      if (n == 6 || n == 9) n = 6;
      numbers[n] ++;
      if(n != 6) {
          if(numbers[n] > max)
            max = numbers[n];
      } else {
        if((numbers[n]-1)/2 + 1 > max)
          max = (numbers[n]-1)/2 +1;
      }
    }

    System.out.println(max);
    br.close();
  }
}