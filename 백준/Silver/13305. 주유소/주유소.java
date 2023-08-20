import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int[] dis = new int[N-1];
        int[] point = new int[N-1];
        int totalDis = 0;
        int min = 1_000_000_000;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N-1; i++) {
            dis[i] = Integer.parseInt(st.nextToken());
            totalDis += dis[i];
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N-1; i++) {
            point[i] = Integer.parseInt(st.nextToken());
            if (point[i] < min) min = point[i];
        }

        long cost = 0;
        for(int i = 0; i < point.length; i++) {
            if (point[i] > min){
                cost += (long) point[i] * dis[i];
                totalDis -= dis[i];
            }
            else {
                cost += (long)min * totalDis;
                break;
            }
        }
        System.out.println(cost);
        br.close();
    }
}
