#include <iostream>
#include <utility>

using namespace std;
pair<int, int> p[5000];

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N;
  cin >> N;

  p[3].first = 1;
  p[5].second = 1;

  for (int i = 3; i <= N; i++) {
    if (p[i].first == 0 && p[i].second == 0) continue;
    const int T = i + 3;
    const int F = i + 5;
    if (T <= N) {
      if ((p[T].first == 0 && p[T].second == 0) || ((p[T].first + p[T].second) > (p[i].first+1 + p[i].second))) {
        p[T].first = p[i].first + 1;
        p[T].second = p[i].second;
      }
    }
    if (F <= N) {
      if ((p[F].first == 0 && p[F].second == 0) || ((p[F].first + p[F].second) > (p[i].first + p[i].second+1))) {
        p[F].first = p[i].first;
        p[F].second = p[i].second + 1;
      }
    }
  }

  if (p[N].first == 0 && p[N].second == 0) cout << -1;
  else cout << (p[N].first + p[N].second);

  return 0;
}
