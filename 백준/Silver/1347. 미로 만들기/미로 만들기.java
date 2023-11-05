import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    char[] C = br.readLine().toCharArray();
    br.close();

    List<LinkedList<Character>> field = new LinkedList<>();
    field.add(new LinkedList<>());
    field.get(0).add('.');

    int D = 0; // 0-south, 1-west, 2-north, 3-east
    int CURRENT_ROW = 0;
    int CURRENT_COLUMN = 0;
    for(char c: C) {
      switch (c) {
        case 'R':
          D = (D+1)%4;
          break;
        case 'L':
          D = (D+3)%4;
          break;
        case 'F':{
          if (D == 0 | D == 2) {
            CURRENT_ROW += (1-D);
            if (field.size() == CURRENT_ROW || CURRENT_ROW < 0) {
              if (CURRENT_ROW < 0) CURRENT_ROW = 0;

              LinkedList<Character> T = new LinkedList<>();
              int repeat = field.get(0).size();
              while(repeat-->0) T.add('#');
              field.add(CURRENT_ROW, T);
            }
          } else if (D == 1 || D == 3) {
            CURRENT_COLUMN += (D-2);
            if (CURRENT_COLUMN < 0 || field.get(0).size() == CURRENT_COLUMN) {
              if (CURRENT_COLUMN < 0) CURRENT_COLUMN = 0;
              Iterator<LinkedList<Character>> it = field.listIterator();
              while (it.hasNext()) it.next().add(CURRENT_COLUMN, '#');
            }
          }
          field.get(CURRENT_ROW).set(CURRENT_COLUMN, '.');
        }
      }
    }

    StringBuilder sb = new StringBuilder();

    Iterator<LinkedList<Character>> rowIt = field.iterator();
    while(rowIt.hasNext()) {
      Iterator<Character> colIt = rowIt.next().iterator();
      while(colIt.hasNext()) sb.append(colIt.next());
      sb.append("\n");
    }
    System.out.print(sb);
  }
}
