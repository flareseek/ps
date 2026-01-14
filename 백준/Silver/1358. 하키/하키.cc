#include <iostream>

using namespace std;

bool is(int x, int y, int cx, int cy, int r) {
  int dx = x - cx, dy = y - cy;
  return (dx * dx + dy * dy) <= (r * r);
}
int main(void) {
  ios::sync_with_stdio(0);
  cin.tie(0);

  int W, H, X, Y, P, x, y;
  cin >> W >> H >> X >> Y >> P;
  const int hy = H+Y, wx = W+X, R = H/2;
  int result = 0;
  while(P--) {
    cin >> x >> y;
    if ((X <= x && x <= wx && Y <= y && y <= hy) || is(x, y, X, Y+R, R) || is(x, y, wx, Y+R, R)) result ++;
  }
  cout << result;

  return 0;
}
