#include <iostream>
#include <utility>
#include <queue>

using namespace std;

char g[100][100];
int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int T;
  cin >> T;

  while(T--) {
    int H, W;
    cin >> H >> W;
    for(int h = 0; h < H; h++)
      for (int w = 0; w < W; w++)
        cin >> g[h][w];

    int cnt = 0;
    for(int h = 0; h < H; h++) {
      for (int w = 0; w < W; w++) {
        if (g[h][w] != '#') continue;
        queue< pair<int, int> > q;
        const int dx[] = {0, 0, -1, 1};
        const int dy[] = {-1, 1, 0, 0};
        q.push({h, w});
        cnt ++;

        while(!q.empty()) {
          auto p = q.front();
          q.pop();
          if (g[p.first][p.second] != '#') continue;
          g[p.first][p.second] = 0;

          for (int i = 0; i < 4; i++) {
            const int r = p.first + dy[i];
            const int c = p.second + dx[i];
            if (0 <= r && r < H && 0 <= c && c < W && g[r][c] == '#') q.push({r, c});
          }
        }
      }
    }
    cout << cnt << "\n";
  }
  return 0;
}
