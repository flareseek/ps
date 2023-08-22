import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        br.close();

        int count = 1;
        while (s < e) {
            int temp = e % 10;
            if (temp != 1 && temp % 2 == 1) {
                System.out.println(-1);
                return;
            }
            if (temp == 1) e /= 10;
            else e /= 2;
            count++;
        }
        if (s == e) System.out.println(count);
        else System.out.println(-1);
    }
}
