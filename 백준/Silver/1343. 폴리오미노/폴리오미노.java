import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                if (count % 4 % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
                for(int x = 0; x < count/4; x++) sb.append("AAAA");
                for(int x = 0; x < count%4/2; x++) sb.append("BB");
                sb.append(".");
                count = 0;
                continue;
            }
            count ++;
        }
        if (count % 4 % 2 != 0) {
            System.out.println(-1);
            return;
        }
        for(int x = 0; x < count/4; x++) sb.append("AAAA");
        for(int x = 0; x < count%4/2; x++) sb.append("BB");
        System.out.println(sb);
    }
}