#include <iostream>

using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int T, N, B;
  cin >> T;
  while(T--) {
    cin >> N >> B;
    while(B--) {
      int a, b;
      cin >> a >> b;
    }
    cout << N - 1 << "\n";
  }
  return 0;
}