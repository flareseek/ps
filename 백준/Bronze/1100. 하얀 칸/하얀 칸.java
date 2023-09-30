import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        for(int c = 0; c < 8; c++) {
            char[] C = br.readLine().toCharArray();
            for(int r = 0; r < 4; r++) {
                if (C[r*2+(c%2)] == 'F') result ++;
            }
        }
        System.out.println(result);
        br.close();
    }
}
