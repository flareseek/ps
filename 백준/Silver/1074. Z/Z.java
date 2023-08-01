import java.io.*;
import java.util.*;

public class Main {
    static int seq = 0;
    static int C;
    static int R;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = (int)Math.pow(2, Integer.parseInt(st.nextToken())-1);
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        dnc(0, 0, N);
        System.out.println(seq);
        br.close();
    }
    static void dnc(int c, int r, int size) {
        if(c==C && r==R) return;
        //2사분면
        if(c <= C && C < c+size && r <= R && R < r+size) {
            dnc(c, r, size/2);
        }
        //1사분면
        else if (c<= C && C < c+size && r + size <= R && R < r + 2*size) {
            seq += size*size;
            dnc(c, r+size, size/2);
        }
        //3사분면
        else if (c+size <= C && C < c + 2*size && r <= R && R < r+size) {
            seq += 2*size*size;
            dnc(c+size, r, size/2);
        }
        //4사분면
        else if (c+size <= C && C < c + 2*size && r + size <= R && R < r +2*size) {
            seq += 3*size*size;
            dnc(c+size, r+size, size/2);
        }
    }
}
