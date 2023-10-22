import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] c = new boolean[5];
        for(char a: br.readLine().toCharArray()) {
            switch (a) {
                case 'M' :
                    c[0] = true;
                    break;
                case 'O':
                    c[1] = true;
                    break;
                case'B':
                    c[2] = true;
                    break;
                case 'I':
                    c[3] = true;
                    break;
                case 'S':
                    c[4] = true;
                    break;
            }
        }
        for(boolean t: c) {
            if(!t) {
                System.out.println("NO");
                br.close();
                return;
            }
        }
        System.out.println("YES");
        br.close();
    }
}