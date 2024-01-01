import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int sum = 0;
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            sum += n*n;
        }
        System.out.println(sum%10);
    }
}