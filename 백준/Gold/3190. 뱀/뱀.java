import java.io.*;
import java.util.*;
import java.util.stream.Stream;

enum D {Left, Right, Up, Down}

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] field = new int[N+1][N+1];

    int T = Integer.parseInt(br.readLine());
    while(T-->0) {
      int[] p = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      field[p[0]][p[1]] = 1;
    }
    T = Integer.parseInt(br.readLine());
    Queue<Event> eventQueue = new LinkedList<>();
    while(T-->0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      eventQueue.add(new Event(Integer.parseInt(st.nextToken()), st.nextToken()));
    }
    br.close();

    Deque<Point> snake = new LinkedList<>();
    snake.addFirst(new Point(1, 1));
    D direction = D.Right;
    Event currentEvent = eventQueue.poll();

    int timer = 1;
    while(true) {
      Point head = new Point(snake.getFirst().x, snake.getFirst().y);
      if(direction == D.Right) head.x ++;
      else if(direction == D.Left) head.x --;
      else if(direction == D.Up) head.y --;
      else if(direction == D.Down) head.y ++;

      if(head.x == 0 || head.x > N || head.y == 0 || head.y > N) {
        System.out.println(timer);
        return;
      }

      if(field[head.y][head.x] == 0) {
        Point prev = snake.removeFirst();
        //마지막 꼬리까지 충돌 체크함
        for(int i = 0; i < snake.size(); i++) {
          Point current = snake.removeFirst();
          if(head.x == current.x && head.y == current.y) {
            System.out.println(timer);
            return;
          }
          snake.addLast(prev);
          prev = current;
        }
      } else field[head.y][head.x] = 0;
      snake.addFirst(head);

      if(currentEvent != null && currentEvent.time == timer) {
        if(direction == D.Right) {
          if(currentEvent.LR.equals("L")) direction = D.Up;
          else direction = D.Down;
        }
        else if(direction == D.Left) {
          if(currentEvent.LR.equals("L")) direction = D.Down;
          else direction = D.Up;
        }
        else if(direction == D.Up) {
          if(currentEvent.LR.equals("L")) direction = D.Left;
          else direction = D.Right;
        }
        else if(direction == D.Down) {
          if(currentEvent.LR.equals("L")) direction = D.Right;
          else direction = D.Left;
        }
        if(!eventQueue.isEmpty()) currentEvent = eventQueue.poll();
        else currentEvent = null;
      }
      timer ++;
    }
  }
}
class Event {
  int time;
  String LR;
  public Event(int time, String LR) {
    this.time = time;
    this.LR = LR;
  }
}

class Point {
  int x;
  int y;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}