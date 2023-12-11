import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] numbers = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);
        int max = 0;
        for(int i = 0; i < numbers.length; i++)
            if (max < numbers[numbers.length - 1 - i] + i)
                max = numbers[numbers.length - 1 - i] + i;
        System.out.println(max + 2);
        br.close();

    }
}
