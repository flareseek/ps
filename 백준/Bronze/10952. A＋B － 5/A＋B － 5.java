import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = null;
        while(!((str = br.readLine()).equals("0 0")))
            sb.append(Stream.of(str.split(" ")).mapToInt(Integer::parseInt).sum()).append("\n");
        br.close();
        System.out.print(sb);
    }
}