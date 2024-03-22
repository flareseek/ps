import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String push = "+\n";
        String pop = "-\n";
        String no = "NO\n";

        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int last = 0;
        while(N-->0) {
            int n = Integer.parseInt(br.readLine());
            if (last < n) {
                while (last < n) {
                    st.push(++last);
                    sb.append(push);
                }
                st.pop();
                sb.append(pop);
            } else if (last == n || (!st.isEmpty() && st.peek() == n)) {
                st.pop();
                sb.append(pop);
            } else if (!st.isEmpty() && st.peek() > n){
                sb.setLength(0);
                sb.append(no);
                break;
            }
        }
        System.out.print(sb);
        br.close();
    }
}
