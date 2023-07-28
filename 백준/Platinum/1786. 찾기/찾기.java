import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] Text = br.readLine().toCharArray();
        char[] Pattern = br.readLine().toCharArray();
        int[] failureIndex = new int[Pattern.length];

        for(int i = 1, j = 0; i < Pattern.length; i++) {
            while(j > 0 && Pattern[i] != Pattern[j]) j = failureIndex[j-1];
            if(Pattern[i] == Pattern[j]) failureIndex[i] = ++j;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0, j = 0; i < Text.length; i++) {
            if(Text[i] == Pattern[j]) {
                if(j == Pattern.length-1) {
                    q.add(i-j+1);
                    j = failureIndex[j];
                    continue;
                }
                j ++;
            }
            else {
                while(j > 0 && Text[i] != Pattern[j]) j = failureIndex[j-1];
                if(Text[i] == Pattern[j]) j ++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(q.size());
        while(!q.isEmpty()) sb.append("\n").append(q.poll());
        System.out.println(sb);
        br.close();
    }
}
