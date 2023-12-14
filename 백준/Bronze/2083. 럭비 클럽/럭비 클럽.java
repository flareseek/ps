import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb =  new StringBuilder();
        while(true) {
            String[] S = br.readLine().split(" ");
            if (S[0].equals("#")) break;

            sb.append(S[0]);
            if (Integer.parseInt(S[1]) > 17 || Integer.parseInt(S[2]) >= 80) sb.append(" Senior\n");
            else sb.append(" Junior\n");
        }
        System.out.print(sb);
        br.close();
    }
}
