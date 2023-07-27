import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] field = new int[N[0]][N[1]];

        while(N[0]-->0) field[field.length-1-N[0]] = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        br.close();

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0, 0, 1));
        field[0][0] = -1;

        int[] cols = {1, 0, -1, 0}; //D, L, U, R
        int[] rows = {0, -1, 0, 1};
        while(!q.isEmpty()) {
            Point s = q.poll();
            if(s.col == field.length-1 && s.row == field[0].length-1) {
                System.out.println(s.lv);
                return;
            }
            for(int i = 0; i < 4; i++) {
                int c = s.col + cols[i];
                int r = s.row + rows[i];
                if(c < 0 || c >= field.length || r < 0 || r >= field[0].length) continue;
                if(field[c][r] == 1) {
                    field[c][r] = -1;
                    q.add(new Point(c, r, s.lv + 1));
                }
            }
        }
    }
}
class Point {
    int col;
    int row;
    int lv;
    public Point(int col, int row, int lv) {
        this.col = col;
        this.row = row;
        this.lv = lv;
    }
}
