#include <iostream>
#include <algorithm>

using namespace std;

int dp[1000][1000] = {{0}};

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int M, N;
  cin >> M >> N;

  int MAX = 0;
  for (int r = 0; r < M; r++) {
    for (int c = 0; c < N; c++) {
      int t;
      cin >> t;
      if (t == 0) {
        dp[r][c] = 1;
        MAX = 1;
      }
    }
  }

  for (int r = 1; r < M; r++) {
    for (int c = 1; c < N; c++) {
      if (!dp[r][c]) continue;
      dp[r][c] = min({dp[r-1][c], dp[r][c-1], dp[r-1][c-1]}) + 1;
      MAX = max(dp[r][c], MAX);
    }
  }

  cout << MAX;
  return 0;
}
