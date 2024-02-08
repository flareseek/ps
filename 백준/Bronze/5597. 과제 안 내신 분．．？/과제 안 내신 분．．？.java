import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] students = new int[30];
        int count = 28;
        while(count-->0) {
            int n = Integer.parseInt(br.readLine());
            students[n-1] ++;
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < students.length; i++) {
            if (students[i] == 0) sb.append(i+1).append("\n");
        }
        System.out.println(sb);
    }
}
