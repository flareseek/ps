#include <iostream>
#include <utility>

#define MAX_N 151

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N, K;
  pair<int, int> p[MAX_N];

  cin >> N >> K;
  for(int i = 0; i < N; i++) {
    int n;
    cin >> n;
    p[i] = {i, n};
  }

  int t = p[0].second;
  for (int i = 0; i <= N; i++) {
    if (t == K) {
      cout << (i+1);
      return 0;
    }

    int t2 = p[t].second;
    if (t == t2) {
      cout << -1;
      return 0;
    }

    t = t2;
  }

  cout << -1;

  return 0;
}
