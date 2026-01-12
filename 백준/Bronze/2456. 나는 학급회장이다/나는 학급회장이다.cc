#include <iostream>
#include <tuple>
#include <algorithm>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N;
  cin >>N;
  pair<tuple<int, int, int>, int> n[3] = {{{}, 1}, {{}, 2}, {{}, 3}};
  while(N--) {
    for (int i = 0; i < 3; i++) {
      int t;
      cin >> t;
      if (t == 1) get<2>(n[i].first) ++;
      else if (t == 2) get<1>(n[i].first) += 2;
      else get<0>(n[i].first) += 3;
    }
  }

  sort(n, n+3, [](const auto& a, const auto& b) {
    int x, y, z, t1, t2;
    tie(x, y, z) = a.first;
    t1 = x+y+z;
    tie(x, y, z) = b.first;
    t2 = x+y+z;
    if (t1 == t2) return a.first > b.first;
    return t1 > t2;
  });

  if (n[0].first == n[1].first) cout << 0;
  else cout << n[0].second;
  int x, y, z;
  tie(x, y, z) = n[0].first;
  cout << " " << (x+y+z);

  return 0;
}
