#include <iostream>
#include <queue>
#include <utility>

#define MAX_LEN 100000

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N, K;
  cin >> N >> K;
  if (N >= K) {
    cout << (N-K);
    return 0;
  }

  bool v[MAX_LEN + 1] = {false};

  queue<int> q;
  q.push(N);
  int cnt = -1;
  while(true) {
    int size = q.size();
    cnt ++;
    while(size--) {
      int p = q.front();
      q.pop();
      if (v[p]) continue;
      if (p == K) {
        cout << cnt;
        return 0;
      }
      v[p] = true;

      const int a = p-1, b = p+1, c = p*2;
      if (a >= 0) q.push(a);
      if (p < K) {
        if (b <= MAX_LEN) q.push(b);
        if (c <= MAX_LEN) q.push(c);
      }
    }
  }
  return 0;
}
