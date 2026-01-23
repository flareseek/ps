#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int T; cin >> T;
  while(T--) {
    long long N, D;
    cin >> N;
    D = N;
    long long f[6] = {0, };
    for(int i = 0; i < 6; i++) {
      cin >> f[i];
      D -= f[i];
    }
    int cnt = 1;
    while(D >= 0) {
      cnt ++;
      D = N;

      long long t[6] = {0, };
      for (int i = 0; i < 6; i++) t[i] = f[i] + f[(i+3)%6] + f[(i+1)%6] + f[(i+5)%6];
      for (int i = 0; i < 6; i++) {
        f[i] = t[i];
        D -= f[i];
      }
    }
    cout << cnt << "\n";
  }
  return 0;
}
