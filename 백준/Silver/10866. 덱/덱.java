import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] deque = new int[N+1];
        int front = 0;
        int rear = 0;
        int size = 0;

        StringBuilder sb = new StringBuilder();
        while(N-->0) {
            String cmd = br.readLine();
            if(cmd.startsWith("push_f")) {
                deque[front] = Integer.parseInt(cmd.split(" ")[1]);
                front = (front-1 +  deque.length) % deque.length;
                size ++;
            } else if(cmd.startsWith("push_b")) {
                rear = (rear+1)%deque.length;
                deque[rear] = Integer.parseInt(cmd.split(" ")[1]);
                size ++;
            } else if(cmd.startsWith("pop_f")) {
                if(front == rear) sb.append("-1").append("\n");
                else {
                    front = (front+1)%deque.length;
                    sb.append(deque[front]).append("\n");
                    size --;
                }
            } else if(cmd.startsWith("pop_b")) {
                if(front == rear) sb.append("-1").append("\n");
                else {
                    sb.append(deque[rear]).append("\n");
                    rear = (rear-1 +  deque.length) % deque.length;
                    size --;
                }
            } else if(cmd.startsWith("size")) {
                sb.append(size).append("\n");
            } else if(cmd.startsWith("emp")) {
                sb.append(rear==front ? 1 : 0).append("\n");
            } else if(cmd.startsWith("fro")) {
                if(rear == front) sb.append("-1").append("\n");
                else sb.append(deque[(front+1)%deque.length]).append("\n");
            } else if(cmd.startsWith("bac")) {
                if(rear == front) sb.append("-1").append("\n");
                else sb.append(deque[rear]).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
