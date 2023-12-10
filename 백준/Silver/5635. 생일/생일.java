import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] young;
        int[] old;
        String youngName = "";
        String oldName = "";
        {
            String[] str = br.readLine().split(" ");
            final int d = Integer.parseInt(str[1]);
            final int m = Integer.parseInt(str[2]);
            final int y = Integer.parseInt(str[3]);
            young = new int[] {d, m, y};
            old = new int[] {d, m, y};
            youngName = str[0];
            oldName = str[0];
            N--;
        }

        while(N-->0) {
            String[] str = br.readLine().split(" ");
            final int d = Integer.parseInt(str[1]);
            final int m = Integer.parseInt(str[2]);
            final int y = Integer.parseInt(str[3]);
            if (y < old[2] || (y == old[2] && m < old[1]) || (y == old[0] && m == old[1] && d < old[0])) {
                old = new int[]{d, m, y};
                oldName = str[0];
                continue;
            }
            if (y > young[2] || (y == young[2] && m > young[1]) || (y == young[0] && m == young[1] && d > young[0])) {
                young = new int[]{d, m, y};
                youngName = str[0];
            }
        }
        System.out.println(youngName);
        System.out.println(oldName);
        br.close();
    }
}
