#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N, M;
  cin >> N >> M;

  int v[1000000] = {0};
  long long l = ((unsigned long long)-1 >> 1);
  long long r = ~l;
  for(int i = 0; i < N; i++) {
    cin >> v[i];
    if (v[i] < l) l = v[i];
    if (r < v[i]) r = v[i];
  }

  r *= M;
  while(l < r) {
    long long cnt = 0;
    long long m = (l+r)/2;

    for (int i = 0; i < N; i++) {
      cnt += m/v[i];
      if (cnt >= M) break;
    }

    if (M <= cnt) r = m;
    else l = m + 1;
  }
  cout << r;
  return 0;
}
