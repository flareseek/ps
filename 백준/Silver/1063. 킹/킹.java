import java.io.*;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] spt = br.readLine().split(" ");
    int[] kp = {spt[0].charAt(1) - '1', spt[0].charAt(0) - 'A'};
    int[] rp = {spt[1].charAt(1) - '1', spt[1].charAt(0) - 'A'};
    int N = Integer.parseInt(spt[2]);

    while(N-->0) {
      String cmd = br.readLine();
      int dc = 0;
      int dr = 0;
      for(int i = 0; i < cmd.length(); i++) {
        switch (cmd.charAt(i)) {
          case 'R':
            dr ++;
            break;
          case 'L':
            dr--;
            break;
          case 'B':
            dc--;
            break;
          case 'T':
            dc++;
            break;
        }
      }
      int kc = kp[0] + dc;
      int kr = kp[1] + dr;
      int rc = kc + dc;
      int rr = kr + dr;
      if (kc < 0 || kc >= 8 || kr < 0 || kr >= 8) continue;
      if ((kc == rp[0] && kr == rp[1]) && (rc < 0 || rc >= 8 || rr < 0 || rr >= 8)) continue;
      kp = new int[]{kc, kr};
      if (kc == rp[0] && kr == rp[1]) rp = new int[]{rc, rr};
    }
    System.out.print((char)(kp[1]+'A'));
    System.out.println(kp[0]+1);
    System.out.print((char)(rp[1]+'A'));
    System.out.println(rp[0]+1);
    br.close();
  }
}