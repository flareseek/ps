#include <iostream>
#include <utility>
#include <cmath>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int t;
  cin >> t;
  while(t--) {
    pair<int, int> s[4];
    for (int i = 0; i < 4; i++)
      cin >> s[i].first >> s[i].second;

    const int x = s[3].first;
    const int y = s[3].second;

    int len[3] = {0};
    int max_i = 0;
    for (int i = 0; i < 3; i++) {
      len[i] = pow(x-s[i].first, 2) + pow(y-s[i].second, 2);
      if (len[max_i] < len[i]) max_i = i;
    }
    const int i1 = (max_i+1) % 3;
    const int i2 = (max_i+2) % 3;
    if (len[i1] != len[i2] || len[i1] + len[i2] != len[max_i]) {
      cout << 0 << "\n";
      continue;
    }

    if (len[max_i] == pow(s[i1].first - s[i2].first, 2) + pow(s[i1].second - s[i2].second, 2)) cout << 1 << "\n";
    else cout << 0 << "\n";
  }
  return 0;
}
