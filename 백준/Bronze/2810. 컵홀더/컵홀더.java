import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int holder = 1;
        String str = br.readLine();
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') i ++;
            holder ++;
        }
        System.out.println(Math.min(number, holder));
        br.close();
    }
}