import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str  = null;
        StringBuilder sb = new StringBuilder();
        while(!(str = br.readLine()).equals("#")) {
            int count = 0;
            for(char c: str.toLowerCase().toCharArray()) {
                switch (c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count ++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
