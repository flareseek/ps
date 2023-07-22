import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] C = br.readLine().toCharArray();

        boolean isTag = false;
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c: C) {
            if(!isTag && (c == ' ' || c == '<')) while(!stack.isEmpty()) sb.append(stack.pop());
            if(c == ' '|| c == '<' || c == '>') sb.append(c);
            if(c == '<' || c == '>') {
                isTag = !isTag;
                continue;
            }
            if(c == ' ') continue;
            else if(isTag) sb.append(c);
            else stack.push(c);
        }
        while(!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb);
        br.close();
    }
}
