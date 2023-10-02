import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cal = 0;
        StringBuilder sb = new StringBuilder();
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("all"))
                cal = ~0;
            else if (cmd.equals("empty"))
                cal = 0;
            else {
                int n = Integer.parseInt(st.nextToken()) - 1;
                int t = 1;
                t <<= n;
                if (cmd.equals("add"))
                    cal |= t;
                else if (cmd.equals("remove"))
                    cal &= (~t);
                else if (cmd.equals("check"))
                    sb.append((cal & t) != 0 ? 1 : 0).append("\n");
                else if (cmd.equals("toggle"))
                    cal ^= t;
            }
        }
        System.out.print(sb);
        br.close();
    }
}
