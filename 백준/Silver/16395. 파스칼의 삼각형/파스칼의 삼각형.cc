#include <iostream>

using namespace std;

int dp[465] = {1, 1, 1, };

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  int r, c;
  cin >> r >> c;

  for (int R = 2; R < r; R++) {
    const int b = (1+R)/2.0*R;
    const int pb = (1+(R-1))/2.0*(R-1);
    dp[b] = 1;
    dp[b+R] = 1;

    for (int C = 1; C < R; C++)
      dp[b+C] = dp[pb + C - 1] + dp[pb + C];

  }

  cout << dp[(int)((1+(r-1))/2.0*(r-1)+(c-1))];
  return 0;
}