import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());

        Deque<Character> dq = new LinkedList<>();
        boolean[] notPrime = new boolean[N+1];
        notPrime[0] = true;
        notPrime[1] = true;
        boolean isRight = true;
        dq.addLast('B');
        int B = 1;
        int S = 0;

        for(int i = 2; i <= N; i++) {
            if ((long)i*i <= N && !notPrime[i])
                for(int j = i*i; j <= N; j += i)
                    notPrime[j] = true;

            if (notPrime[i]) {
                if (isRight) dq.addLast('B');
                else dq.addFirst('B');
                B ++;
            }
            else {
                if (isRight) {
                    if (dq.peek() == 'B') {
                        dq.removeLast();
                        dq.addLast('S');
                        dq.addLast('S');
                        B--;
                        S +=2;
                    } else {
                        dq.addLast('S');
                        S ++;
                        isRight = false;
                    }
                } else {
                    if (dq.peekFirst() == 'B') {
                        dq.removeFirst();
                        dq.addFirst('S');
                        dq.addFirst('S');
                        B--;
                        S +=2;
                    } else {
                        dq.addFirst('S');
                        S ++;
                        isRight = true;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(B).append(" ").append(S);
        System.out.println(sb);
        br.close();
    }
}
