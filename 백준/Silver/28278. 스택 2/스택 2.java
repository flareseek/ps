import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while(N-->0) {
            String str = br.readLine();

            switch (str.charAt(0)) {
                case '1':
                    stack.push(str.split(" ")[1]);
                    break;
                case '2':
                    if (stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.pop()).append("\n");
                    break;
                case '3':
                    sb.append(stack.size()).append("\n");
                    break;
                case '4':
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case '5':
                    if (stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.peek()).append("\n");
                    break;
            }
        }
        br.close();
        System.out.print(sb);
    }
}
