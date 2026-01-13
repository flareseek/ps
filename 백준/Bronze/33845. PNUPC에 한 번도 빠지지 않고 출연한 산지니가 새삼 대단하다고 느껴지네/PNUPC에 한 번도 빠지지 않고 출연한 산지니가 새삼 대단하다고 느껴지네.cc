#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  string S, T;
  cin >> S >> T;

  bool isA['z'-'a'+1] = {false};
  for (char c: S) isA['z'-c] = true;
  for (char c: T) if (!isA['z'-c]) cout << c;

  return 0;
}
