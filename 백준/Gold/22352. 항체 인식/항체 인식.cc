#include <iostream>
#include <utility>
#include <queue>

using namespace std;

int f[30][30] = {{0}};
int s[30][30] = {{0}};
bool v[30][30] = {{false}};

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N, M;
  cin >> N >> M;

  for (int r = 0; r < N; r++)
    for (int c = 0; c < M; c++)
      cin >> f[r][c];

  for (int r = 0; r < N; r++)
    for (int c = 0; c < M; c++)
      cin >> s[r][c];

  const int dr[] = { 0, 0, 1, -1 };
  const int dc[] = { 1, -1, 0, 0 };
  queue<pair<int, int> > q;
  bool isFound = false;
  for(int r = 0; r < N; r++) {
    for (int c = 0; c < M; c++) {
      if (v[r][c]) continue;
      q.push({r, c});

      const int FN = f[r][c];
      const int SN = s[r][c];

      while(!q.empty()) {
        const auto pop = q.front();
        const int crow = pop.first;
        const int ccol = pop.second;
        q.pop();
        if (v[crow][ccol]) continue;

        if (f[crow][ccol] == FN) {
          if (s[crow][ccol] != SN || (isFound && f[crow][ccol] != s[crow][ccol])) {
            cout << "NO";
            return 0;
          }
          v[crow][ccol] = true;
          for (int i = 0; i < 4; i++) {
            const int srow = crow + dr[i];
            const int scol = ccol + dc[i];
            if (0 <= srow && srow < N && 0 <= scol && scol < M)
              q.push({crow + dr[i], ccol + dc[i]});
          }
        }
      }
      if (f[r][c] != s[r][c]) isFound = true;
    }
  }
  cout << "YES";
  return 0;
}
