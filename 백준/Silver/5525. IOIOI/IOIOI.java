import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        final int size = Integer.parseInt(br.readLine());
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) sb.append("IO");
        sb.append("I");
        int cnt = 0;
        for(int i = 0; i <= str.length()-sb.length(); i++) if (str.charAt(i) == 'I' && str.substring(i, i+sb.length()).equals(sb.toString())) {
            cnt ++;
            i ++;
        }
        System.out.println(cnt);
        br.close();
    }
}
