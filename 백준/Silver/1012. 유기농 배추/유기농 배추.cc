#include <iostream>
#include <queue>
#include <utility>

using namespace std;


int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  int T;
  cin >> T;

  while(T--) {
    int M, N, K;
    cin >> M >> N >> K;

    int g[50][50] = {{0}};
    while(K--) {
      int x, y;
      cin >> x >> y;
      g[x][y] = 1;
    }

    int cnt = 0;
    for (int r = 0; r < M; r++) {
      for (int c = 0; c < N; c++) {
        if (g[r][c] != 1) continue;
        cnt ++;

        queue < pair<int, int> > q;
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};
        q.push({r, c});
        while(!q.empty()) {
          auto p = q.front();
          q.pop();
          if (g[p.first][p.second] != 1) continue;
          g[p.first][p.second] = 2;

          for (int i = 0; i < 4; i++) {
            const int R = p.first + dy[i];
            const int C = p.second + dx[i];
            if (0 <= R && R < M && 0 <= C && C < N) {
              q.push({R, C});
            }
          }
        }
      }
    }
    cout << cnt << "\n";
  }
  return 0;
}
