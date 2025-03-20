#include <iostream>
#include <algorithm>

using namespace std;

int score[301] = {};
int dp[301] = {};

int main(void) {
  int N;

  cin >> N;

  for (int i = 1; i <= N; i++) {
    cin >> score[i];
  }

  if (N <= 2) {
    if (N == 2) cout << score[1] + score[2];
    else cout << score[1];
    return 0;
  }

  dp[1] = score[1];
  dp[2] = score[1]+score[2];

  for (int i = 3; i <= N; i++)
    dp[i] = max(score[i] + score[i-1] + dp[i-3], score[i] + dp[i-2]);
  cout << dp[N];
  return 0;
}

