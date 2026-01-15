#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int T, k;
  cin >> T;
  while(T--) {
    cin >> k;
    cout << k*23 << "\n";
  }

  return 0;
}
