#include <iostream>
using namespace std;

long long dp[101] = { 0, 1, 1, 1, };
long long fn(int n) {
  if (dp[n] == 0) dp[n] = fn(n-2) + fn(n-3);
  return dp[n];
}

int main(void) {
  int T;
  cin >> T;
  
  for (int i = 0; i < T; i++) {
    int N;
    cin >> N;
    cout << fn(N) << "\n";
  }
  return 0;
}
