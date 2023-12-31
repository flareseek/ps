import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine())/100*100;
        final int F = Integer.parseInt(br.readLine());
        br.close();

        final int r = N%F;
        System.out.println(String.format("%02d", r == 0 ? 0 : F-r));
    }
}