
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        for(; i >= 1; i--) {
            for(int k = i; k > 0; k--) sb.append("*");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}