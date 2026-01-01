#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int T, N;
  cin >> T;
  while(T-->0) {
    int c = 0;
    cin >> N;
    for (int i = 2; i <= N; i++) {
      int t = N;
      while (!(t % i)) {
        c ++;
        t /= i;
      }
    }
    cout << c << "\n";
  }

  return 0;
}
