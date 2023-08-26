import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int[] score = new int['Z'-'A'+1];
        for(int i = 0; i < N; i++) {
            char[] C = br.readLine().toCharArray();
            int d = 1;
            for(int k = C.length - 1; k >=0; k--) {
                score[C[k]-'A'] += d;
                d *= 10;
            }
        }
        Arrays.sort(score);
        int dec = 10;
        int result = 0;
        for(int i = score.length - 1; i >= 0; i --) result += (--dec) * score[i];
        System.out.println(result);
    }
}
