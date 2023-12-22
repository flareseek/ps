import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = 0;
        int m = 0;
        while(st.hasMoreTokens()) {
            final int N = Integer.parseInt(st.nextToken());
            y += (((N)/30)+1) * 10;
            m += (((N)/60)+1) * 15;
        }
        if (y == m) {
            System.out.println("Y M " + y);
        } else if (y > m) {
            System.out.println("M " + m);
        } else {
            System.out.println("Y " + y);
        }
        br.close();
    }
}