#include <iostream>
#include <algorithm>

#define MAX_INT (unsigned int) -1 >> 1
using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N, T;
  cin >> N >> T;
  int min = MAX_INT;
  while(N--) {
    int s, i, c;
    cin >> s >> i >> c;

    while(c--) {
      if (T <= s && s < min) {
        min = s;
        break;
      }
      s += i;
    }
  }

  if (min == MAX_INT) cout << -1;
  else cout << min - T;
  return 0;
}
