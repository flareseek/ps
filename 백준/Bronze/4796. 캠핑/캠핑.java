import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNumber = 1;
        StringBuilder sb = new StringBuilder();
        while(true) {
            int[] number = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (number[0] == 0) {
                br.close();
                System.out.print(sb);
                return;
            }
            sb.append(String.format("Case %d: ", caseNumber++));
            int i = (number[2]/number[1]) * number[0];
            int j = number[2]%number[1];
            sb.append(i+ (Math.min(j, number[0]))).append("\n");
        }
    }
}