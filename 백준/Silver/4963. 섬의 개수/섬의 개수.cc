#include <iostream>
#include <queue>
#include <utility>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int w, h;
  const int dx[] = {0, 0, 1, -1, -1, 1, -1, 1};
  const int dy[] = {1, -1, 0, 0, -1, -1, 1, 1};
  while((cin >> w >> h)) {
    if (!w | !h) break;

    bool f[50][50] = {{false}};
    bool v[50][50] = {{false}};

    for (int r = 0; r < h; r++)
      for (int c = 0; c < w; c++)
        cin >> f[r][c];


    int cnt = 0;
    for (int r = 0; r < h; r++) {
      for (int c = 0; c < w; c++) {
        if (v[r][c] || !f[r][c]) continue;

        cnt ++;
        queue< pair<int, int> > q;
        q.push({r, c});

        while(!q.empty()) {
          auto p = q.front();
          q.pop();

          if (v[p.first][p.second]) continue;
          v[p.first][p.second] = true;
          for(int i = 0; i < 8; i++) {
            const int R = p.first + dy[i];
            const int C = p.second + dx[i];
            if (0 <= R && R < h && 0 <= C && C < w && f[R][C]) q.push({R, C});
          }
        }
      }
    }
    cout << cnt << "\n";
  }
  return 0;
}
