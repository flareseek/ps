#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int N;
  cin >> N;

  if (N == 1) {
    cout << 0;
    return 0;
  }

  N -= 2;
  unsigned long long result = 2;
  while(N--) result = (result * 3) % 1000000009;
  cout << result;

  return 0;
}
