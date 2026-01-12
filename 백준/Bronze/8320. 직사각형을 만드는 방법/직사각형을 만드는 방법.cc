#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int n, cnt = 0;
  cin >> n;
  for (int i = 1; i <= n; i++) {
    if (i*i > n) break;
    for (int j = i; j <=n; j++) if (i*j <= n) cnt ++;
  }

  cout << cnt;
  return 0;
}
