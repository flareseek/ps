#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  char t;
  int result = 0;
  int n = 0;
  for (int i = 0; i < 12; i++) {
    cin >> t;
    if (t != '*') result += (i%2 ? 3 : 1) * (t-'0');
    else n = (i%2 ? 3 : 1);
  }
  cin >> t;
  result += (t-'0');
  for (int i = 0; i <= 9; i++) {
    if ((result + (n * i)) % 10) continue;
    cout << i;
    break;
  }
  return 0;
}
