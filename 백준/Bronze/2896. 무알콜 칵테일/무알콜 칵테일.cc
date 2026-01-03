#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  float A, B, C;
  int I, J, K;
  cin >> A >> B >> C >> I >> J >> K;

  float m = min({A/I, B/J, C/K});

  cout.precision(4);
  cout << fixed;
  cout << (A-I*m) << " " << (B-J*m) << " " << (C-K*m);
  return 0;
}
