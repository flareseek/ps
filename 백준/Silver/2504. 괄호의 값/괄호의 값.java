import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] C = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        boolean is = true;
        for (int i = 0; i < C.length; i++) {
            if (C[i] == '(') stack.push(-2);
            else if (C[i] == '[') stack.push(-3);
            else if (C[i] == ')') {
                int t = 0;
                if (stack.isEmpty()) {
                    is = false;
                    break;
                }
                int pop = stack.pop();
                if (pop == -2) {
                    stack.push(2);
                    continue;
                }
                while (!stack.isEmpty() && pop != -2 && pop != -3) {
                    t += pop;
                    pop = stack.pop();
                }
                if (pop == -2) stack.push(t * 2);
                else {
                    is = false;
                    break;
                }
            } else {
                int t = 0;
                if (stack.isEmpty()) {
                    is = false;
                    break;
                }
                int pop = stack.pop();
                if (pop == -3) {
                    stack.push(3);
                    continue;
                }
                while (!stack.isEmpty() && pop != -2 && pop != -3) {
                    t += pop;
                    pop = stack.pop();
                }
                if (pop == -3) stack.push(t * 3);
                else {
                    is = false;
                    break;
                }
            }
        }
        if (!is) System.out.println(0);
        else {
            int sum = 0;
            while (!stack.isEmpty()) {
                int pop = stack.pop();
                if(pop < 0) {
                    sum = 0;
                    break;
                }
                sum += pop;
            }
            System.out.println(sum);
        }
        br.close();
    }
}