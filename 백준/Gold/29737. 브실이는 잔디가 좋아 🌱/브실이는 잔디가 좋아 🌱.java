import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    final int W = Integer.parseInt(st.nextToken());
    Streak[] streaks = new Streak[N];
    char[][] data = new char[W][7];

    while(N-->0) {
      streaks[N] = new Streak(br.readLine());
      // data[week][day]로 데이터 구조 변경
      for (int day = 0; day < 7; day++) {
        String str = br.readLine();
        for (int week = 0; week < W; week++) {
          data[week][day] = str.charAt(week);
        }
      }

      int tempLength = 0;
      int tempFreeze = 0;
      int tempStartDate = 0;
      for (int week = 0; week < W; week++) {
        for (int day = 0; day < 7; day ++) {
          switch (data[week][day]) {
            case 'O': {
              tempLength ++;
              if (tempLength == 1) {
                tempFreeze = 0;
                tempStartDate = (week*7) + (day+1);
              }

              if (tempLength == streaks[N].maxStreakLength && tempFreeze < streaks[N].maxStreakFreeze) {
                streaks[N].maxStreakFreeze = tempFreeze;
                streaks[N].maxStreakStartDate = tempStartDate;
              } else if (tempLength > streaks[N].maxStreakLength) {
                streaks[N].maxStreakLength = tempLength;
                streaks[N].maxStreakFreeze = tempFreeze;
                streaks[N].maxStreakStartDate = tempStartDate;
              }
              break;
            }
            case 'X':
              streaks[N].failureCount ++;
              tempLength = 0;
              tempFreeze = 0;
              break;
            case 'F':
              tempFreeze ++;
              break;
          }
        }
      }
    }
    Arrays.sort(streaks, (a, b) -> {
      if (a.maxStreakLength != b.maxStreakLength) return b.maxStreakLength - a.maxStreakLength;
      if (a.maxStreakFreeze != b.maxStreakFreeze) return a.maxStreakFreeze - b.maxStreakFreeze;
      if (a.maxStreakStartDate != b.maxStreakStartDate) return a.maxStreakStartDate - b.maxStreakStartDate;
      if (a.failureCount != b.failureCount) return a.failureCount - b.failureCount;
      return a.name.compareTo(b.name);
    });

    int rank = 0;
    StringBuilder sb = new StringBuilder();
    sb.append(++rank).append(". ").append(streaks[0].name).append("\n");
    for (int i = 1; i < streaks.length; i++) {
      if (!(streaks[i-1].maxStreakLength == streaks[i].maxStreakLength
              && streaks[i-1].maxStreakFreeze == streaks[i].maxStreakFreeze
              && streaks[i-1].maxStreakStartDate == streaks[i].maxStreakStartDate
              && streaks[i-1].failureCount == streaks[i].failureCount)) rank ++;
      sb.append(rank).append(". ").append(streaks[i].name).append("\n");
    }
    System.out.print(sb);
  }
}

class Streak {
  public String name;
  public int maxStreakLength = 0;
  public int maxStreakFreeze = 0;
  public int maxStreakStartDate = 0;
  public int failureCount = 0;
  public Streak(String name) {
    this.name = name;
  }
}

