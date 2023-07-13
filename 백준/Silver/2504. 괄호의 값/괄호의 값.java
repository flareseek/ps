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
            else {
                int nn = C[i] == ')' ? 2 : 3;
                int t = 0;
                if (stack.isEmpty()) {
                    is = false;
                    break;
                }
                int pop = stack.pop();
                if (pop == -nn) {
                    stack.push(nn);
                    continue;
                }
                while (!stack.isEmpty() && pop != -2 && pop != -3) {
                    t += pop;
                    pop = stack.pop();
                }
                if (pop == -nn) stack.push(t * nn);
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