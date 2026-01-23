#include <iostream>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);
  int c, b;
  cin >> c >> b;

  cout.precision(6);
  cout << fixed;
  cout << ((double)c/b);
  return 0;
}
