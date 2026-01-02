#include <iostream>
#include <queue>
#include <cmath>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N;
  cin >> N;
  queue<int> q;

  for (int i = 1; i <= N; i++)
    q.push(i);

  int stage = 1;
  while(q.size() != 1) {
    long long t = pow(stage++, 3);
    if (t > (long long)q.size()) t %= (long long)q.size();
    if (t == 0) t = q.size();
    for(long long i = 1; i < t; i++) {
      q.push(q.front());
      q.pop();
    }
    q.pop();
  }

  cout << q.front();
  return 0;
}
